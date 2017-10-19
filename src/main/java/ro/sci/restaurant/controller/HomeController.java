package ro.sci.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(name = "home", method = RequestMethod.GET)
    public String getHomePage() {
        return "home";
    }
}
