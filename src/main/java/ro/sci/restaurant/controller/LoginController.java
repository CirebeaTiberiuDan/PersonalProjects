package ro.sci.restaurant.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.sci.restaurant.model.Credentials;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController extends AbstractController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm(Model model) {
        return "loginTest";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Credentials u = credentialService.getByUsername(username);
        if (u == null) {
            return "success";
        }
        if (u.getPassword().equals(password) && u.getUsername().equals(username)) {
            HttpSession thisSession = request.getSession(true);
            this.setUserInSession(thisSession, u);
        }
        return "home";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }
}

