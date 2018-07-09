package com.twimi.rainbow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @RequestMapping("/test/cookie")
    String testCookie(ModelMap modelMap,
                      @CookieValue(value = "ccc",required = false)String ccc){
        //Cookie是本地浏览器存储的
        String message = "Cookie Value = " + ccc;
        modelMap.addAttribute("message",message);
        return "test";
    }
}
