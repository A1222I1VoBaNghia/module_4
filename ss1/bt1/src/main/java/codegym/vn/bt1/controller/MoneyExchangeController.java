package codegym.vn.bt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyExchangeController {
    @GetMapping("/exchange")
    public String exchange(@RequestParam double usd, double rate, Model model) {
        double vnd = usd * rate;
        model.addAttribute("vnd", vnd);
        return "exchangemoney";
    }
}
