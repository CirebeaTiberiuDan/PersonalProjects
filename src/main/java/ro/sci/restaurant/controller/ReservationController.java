package ro.sci.restaurant.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.sci.restaurant.model.Customer;

import java.util.Date;


@Controller
public class ReservationController extends AbstractController {

    @RequestMapping(value = "/addreservation", method = RequestMethod.GET)
    public String makeReservationForm(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("date", new Date());
        return "addreservation";
    }

    @RequestMapping(value = "/addreservation", method = RequestMethod.POST)
    public String makeReservation(@ModelAttribute Customer customer, @ModelAttribute Date date) {
        reservationService.add(customer);
        return "addreservation";
    }

    @RequestMapping(value = "/removereservation", method = RequestMethod.GET)
    public String removeReservationForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "removereservation";
    }

    @RequestMapping(value = "/removereservation", method = RequestMethod.POST)
    public String removeReservation(@ModelAttribute Customer customer) {
        reservationService.remove(customer);
        return "removereservation";
    }

    @RequestMapping(value = "/getAllReservations", method = RequestMethod.GET)
    public String getAllReservations(Model model) {
        model.addAttribute("customers", reservationService.getAll());
        return "allReservations";
    }

}
