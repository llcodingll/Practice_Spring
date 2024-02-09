package llcodingll.llcodingllspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IAttribute;

@Controller
public class Hellocontroller {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}