package ro.sci.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ro.sci.restaurant.model.Credentials;
import ro.sci.restaurant.service.*;

import javax.servlet.http.HttpSession;


public class AbstractController {

    public static final String userSessionKey = "user_id";
    @Autowired
    protected EmployeeService employeeService;

    @Autowired
    protected ReservationService reservationService;

    @Autowired
    protected StockService stockService;

    @Autowired
    protected MenuService menuService;

    @Autowired
    protected CredentialsService credentialService;


    protected Credentials getUserFromSession(HttpSession session) {

        Integer userId = (Integer) session.getAttribute(userSessionKey);
        return userId == null ? null : credentialService.getByUid(userId);
    }

    protected void setUserInSession(HttpSession session, Credentials user) {
        session.setAttribute(userSessionKey, user.getUid());
    }

}

