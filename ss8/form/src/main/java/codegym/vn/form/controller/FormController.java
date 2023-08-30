package codegym.vn.form.controller;

import codegym.vn.form.entity.User;
import codegym.vn.form.service.UserService;
import codegym.vn.form.utils.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class FormController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserValidator userValidator;

    @GetMapping("/login")
    public String displayFormLogin(Model model){
        model.addAttribute("user", new User());
        return "index";
    }
    @PostMapping("/login")
    public String doLogin(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        userValidator.validate(user,bindingResult);
        if(bindingResult.hasErrors()){
            return "index";
        }
        userService.create(user);
        return "redirect:/result";
    }
    @GetMapping("/result")
    public  String displayResult(){

        return "result";
    }
}
