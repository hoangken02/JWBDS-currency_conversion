package com.kenit.currencyconversion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    @GetMapping("/currency-conversion")
    public String index(){
        return "index";
    }

    @GetMapping("/currency-conversion/result")
    public String result(Model model, @RequestParam("usd") int usd,@RequestParam("rate") int rate){
        int vnd = usd * rate;
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",vnd);
        model.addAttribute("rate",rate);
        return "conversion";
    }
}
