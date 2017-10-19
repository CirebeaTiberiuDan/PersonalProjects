package ro.sci.restaurant.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.sci.restaurant.model.Credentials;
import ro.sci.restaurant.model.Employee;

@Controller
public class EmployeeController extends AbstractController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    /////////////////////////////////////////
    @RequestMapping(value = "/getCurrentUser", method = RequestMethod.GET)
    public String currentUserForm(Model model) {
        //model.addAttribute("credentials", new Credentials());
        return "usertest";
    }

    @RequestMapping(value = "/addEmployeeCredentials", method = RequestMethod.GET)
    public String credentialForm(Model model) {
        model.addAttribute("credentials", new Credentials());
        return "credentials";
    }

    @RequestMapping(value = "/addEmployeeCredentials", method = RequestMethod.POST)
    public String addCredential(@ModelAttribute Credentials credentials) {
        credentialService.add(credentials);
        return "credentials"; //TODO TO BE REVIEWED If binding result is necessary
    }

    @RequestMapping(value = "/allcredentials", method = RequestMethod.GET)
    public String getLoginForm(Model model) {

        model.addAttribute("credential", credentialService.getAll());
        return "allcredentials";
    }

    /////////////////////////////////////////
    @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
    public String employeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeService.add(employee);
        return "credentials"; //TODO TO BE REVIEWED If binding result is necessary
    }

    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute Employee employee) {
        employeeService.update(employee);
        return "success"; //TODO DO WE NEED THIS ?
    }

    @RequestMapping(value = "/delEmployee", method = RequestMethod.POST)
    public String remEmployee(@ModelAttribute Employee employee) {
        employeeService.remove(employee);
        return "success";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAllForm(Model model) {
        model.addAttribute("employee", employeeService.getAll());
        return "employees";
    }
}

