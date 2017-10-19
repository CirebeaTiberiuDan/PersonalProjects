package ro.sci.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.sci.restaurant.model.Ingredients;


@Controller
public class StockController extends AbstractController {

    @RequestMapping(value = "/addItem", method = RequestMethod.GET)
    public String addIngredientsForm(Model model) {
        model.addAttribute("itemAdd", new Ingredients());
        return "additem";
    }

    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public String addIngredients(@ModelAttribute Ingredients itemAdd) {
        stockService.add(itemAdd);
        return "additem";
    }

    // TODO TO BE REVIEWED
    @RequestMapping(value = "/removeItem", method = RequestMethod.GET)
    public String removeIngredientsForm(Model model) {
        model.addAttribute("itemRemove", new Ingredients());
        return "removeitem";
    }

    @RequestMapping(value = "/removeItem", method = RequestMethod.POST)
    public String removeIngredients(@ModelAttribute Ingredients itemRemove) {
        stockService.remove(itemRemove);
        return "removeitem"; //TODO TO  BE REVIEWED
    }

    @RequestMapping(value = "/restaurant/getAllItems", method = RequestMethod.GET)
    public String getStock(Model model) {
        model.addAttribute("items", stockService.getAll());
        return "getstock";
    }
}

