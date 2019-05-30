package com.twimi.rainbow.Controller;

import com.twimi.rainbow.Dao.StudentDao;
import com.twimi.rainbow.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        modelMap.addAttribute("message", "内心永远是彩虹色");
        return "index";
    }

    @RequestMapping("/test")
    public String test(ModelMap modelMap) {
        modelMap.addAttribute("title", "你需要让view渲染的标题");
        modelMap.addAttribute("message", "你需要让view渲染的内容");
        return "index";
    }

    @RequestMapping("/lyf")
    public String lyf(ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        modelMap.addAttribute("message", "人生苦短学啥Java");
        return "java";
    }

    @RequestMapping("/htx")
    public String htx(ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        modelMap.addAttribute("message", "这是小可爱写的代码");
        return "index";
    }

    @RequestMapping("/yu")
    public String yu(@RequestParam(name = "name", required = false) String name, ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        modelMap.addAttribute("message", name + "你好");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginAction(@RequestParam(name = "username") String username,
                              @RequestParam(name = "password") String password,
                              ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        if ("ivan".equals(username) && "123".equals(password)) {
            modelMap.addAttribute("message", "登录成功");
        } else {
            modelMap.addAttribute("message", "登录失败,用户名:" + username + ",密码:" + password);
        }
        return "index";
    }

    @RequestMapping("/table")
    public String table(ModelMap modelMap) {
        StudentDao dao = new StudentDao();
        List<Student> students = dao.getStudents();
        modelMap.addAttribute("students", students);
        return "table";
    }

    @RequestMapping("/hxf")
    public String hxf(ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        modelMap.addAttribute("message", "这是韩晓菲写的代码");
        return "index";
    }

    @RequestMapping("/jty")
    public String jty(ModelMap modelMap) {
        modelMap.addAttribute("title", "Hello World");
        modelMap.addAttribute("message", "这是姜天艺写的代码");
        return "index";
    }

    @RequestMapping("/wxq")
    public String wxq(ModelMap modelMap) {
        modelMap.addAttribute("title", "AAAAAAAApril");
        modelMap.addAttribute("message", "BBBBBBBartra");
        return "index";
    }
}
