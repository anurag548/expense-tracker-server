package io.delta.expense_tracker.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(path = "/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

}
