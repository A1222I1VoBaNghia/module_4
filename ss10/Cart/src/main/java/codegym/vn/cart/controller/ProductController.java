package codegym.vn.cart.controller;

import codegym.vn.cart.dto.CartDto;
import codegym.vn.cart.dto.ProductDto;
import codegym.vn.cart.entity.Product;
import codegym.vn.cart.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
@RequestMapping("/shop")
@SessionAttributes("cart")
public class ProductController {
    @ModelAttribute("cart")
    public CartDto initCart(){
        return new CartDto();
    }
    @Autowired
    private ProductService productService;

   @GetMapping
    public ModelAndView showListPage(Model model, @CookieValue(value = "idProduct",defaultValue = "-1") Integer idProduct){
       if(idProduct!=-1){
           model.addAttribute("historyProduct",productService.findByID(idProduct).get());
       }
       return new ModelAndView("/list","productList",productService.findAll());
   }
   @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable int id, HttpServletResponse response){
       Cookie cookie = new Cookie("idProduct", id + "");
       cookie.setMaxAge(1*24*60*60*7);
       cookie.setPath("/");
       response.addCookie(cookie);
       return new ModelAndView("detail", "product",productService.findByID(id).get());
   }
   @GetMapping("/add/{id}")
    public String addToCart(@PathVariable int id, @SessionAttribute("cart") CartDto cartDto){
       Optional<Product> optionalProduct = productService.findByID(id);
       if(optionalProduct.isPresent()) {
           ProductDto productDto = new ProductDto();
           BeanUtils.copyProperties(optionalProduct.get(),productDto);
           cartDto.addProduct(productDto);
       }
       return "redirect:/cart";
   }
}
