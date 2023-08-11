package codegym.vn.productmanagement.controller;

import codegym.vn.productmanagement.entity.Product;
import codegym.vn.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/list")
    public String displayList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "list";
    }
    @GetMapping("/detail")
    public String displayDetail(Model model, @RequestParam("id") int id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.delete(product);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/list";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("action", "create");
        return "create";
    }
    @PostMapping("/create")
    public String doCreateorUpdate(@ModelAttribute("product") Product product, @RequestParam("action") String action) {
        if("create".equals(action)){
            productService.create(product);
        } else {
            productService.update(product);
        }
        return "redirect:/list";
    }
    @GetMapping("/edit")
    public String displayCreate(Model model, @RequestParam("id") int id) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("action", "edit");
        return "create";
    }

}
