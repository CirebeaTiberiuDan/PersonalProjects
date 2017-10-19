package ro.sci.restaurant.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.sci.restaurant.model.Menu;


@Controller
public class MenuController extends AbstractController {

    @RequestMapping(value = "/addmenuitems", method = RequestMethod.GET)
    public String addMenuForm(Model model) {

        model.addAttribute("menuItem", new Menu());
        return "addmenuitem";
    }

    @RequestMapping(value = "/addmenuitems", method = RequestMethod.POST)
    public String addMenu(@ModelAttribute Menu menuItem) {
        menuService.add(menuItem);
        return "addmenuitem";
    }

    @RequestMapping(value = "/removemenuitems", method = RequestMethod.GET)
    public String removeMenuForm(Model model) {
        model.addAttribute("menuItem", new Menu());
        return "removemenuitem";
    }

    @RequestMapping(value = "/removemenuitems", method = RequestMethod.POST)
    public String removeMenu(@ModelAttribute Menu menuItem) {
        menuService.remove(menuItem);
        return "removemenuitem";
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(Model model) {
        model.addAttribute("menuitems", menuService.getAll());
        return "success";
    }
}