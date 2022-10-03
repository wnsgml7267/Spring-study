package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        //스프링부트 템플릿엔진 기본 viewName매핑임
        return "hello"; //resources/templates/hello.html로 가서 랜더링하라는 뜻
    }
}
