package com.twimi.rainbow.Controller;

import com.twimi.rainbow.Dao.StudentDao;
import com.twimi.rainbow.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
        modelMap.addAttribute("message","人生苦短学啥Java");
        return "java";
    }

    @RequestMapping("/htx")
    public String htx(ModelMap modelMap){
        modelMap.addAttribute("title","Hello World");
        modelMap.addAttribute("message","这是小可爱写的代码");
        return "index";
    }

    @RequestMapping("/table")
    public String table(ModelMap modelMap){
        StudentDao dao = new StudentDao();
        List<Student> students = dao.getStudents();
        modelMap.addAttribute("students",students);
        return "table";
    }
}
