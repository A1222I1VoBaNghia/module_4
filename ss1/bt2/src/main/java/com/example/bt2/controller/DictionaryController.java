package com.example.bt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
        public String  translate(String word){
            String [] vietArr = {"tam biet","may man","tuoi","xin chao","chuc ngu ngon","hanh phuc"};
            String [] engArr = {"goodbye","lucky","age","hello","goodnight","happy"};
            for (int i = 0; i <vietArr.length ; i++) {
                if(word.equals(engArr[i])){
                    return vietArr[i];
                }
            }
            return "Not Found";
        }

        @GetMapping("/search")
        public String search(@RequestParam String word, Model model){
            model.addAttribute("trans", translate(word));
            return "dictionary";
        }
}
