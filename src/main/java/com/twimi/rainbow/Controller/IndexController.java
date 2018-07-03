package com.twimi.rainbow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("title","Hello World");
        modelMap.addAttribute("message","内心永远是彩虹色");
        return "index";
    }

    @RequestMapping("/lyf")
    public String lyf(ModelMap modelMap){
        modelMap.addAttribute("title","Hello World");
        modelMap.addAttribute("message","Made By Ivan Some Change...");
        return "index";
    }

    @RequestMapping("/htx")
    public String htx(ModelMap modelMap){
        modelMap.addAttribute("title","Hello World");
        modelMap.addAttribute("message","这是小可爱写的代码");
        return "index";
    }
}
