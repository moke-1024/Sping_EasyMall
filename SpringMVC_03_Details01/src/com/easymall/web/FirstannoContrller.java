package com.easymall.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstannoContrller {
    @RequestMapping("/firstanno.action")
    public String firstanno(Model model){
        System.out.println("firstanno....");
        model.addAttribute("k1","v1");
        model.addAttribute("k2","v2");
        model.addAttribute("k3","v3");
        return "firstanno";
    }
}
