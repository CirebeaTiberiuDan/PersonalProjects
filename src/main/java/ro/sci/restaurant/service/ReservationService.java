package ro.sci.restaurant.service;
//

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.restaurant.model.Customer;
import ro.sci.restaurant.repository.ReservationRepository;

import java.util.ArrayList;
import java.util.List;

//import ro.sci.restaurant.model.Reservation;

///**
// * Created by cosmin on 9/25/17.
// */
@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Customer> getAll() {
        List<Customer> customer = new ArrayList<>();
        reservationRepository.findAll()
                .forEach(customer::add);
        return customer;
    }

    public void update(Customer employee) {
        reservationRepository.save(employee);
    }

    public void add(Customer customer) {
        boolean customerExists = false;
        for (Customer cust : reservationRepository.findAll()) {
            if (cust.getPhoneNumber().equals(customer.getPhoneNumber())) {
                customerExists = true;
                break;
            }
        }
        if (customerExists == false) {
            reservationRepository.save(customer);
        }
    }

    public void remove(Customer customer) {
        for (Customer cust : reservationRepository.findAll()) {
            if (cust.getPhoneNumber().equals(customer.getPhoneNumber())) {
                reservationRepository.delete(cust.getUid());
                break;
            }
        }
    }
    public void delete(int id) {
        reservationRepository.delete(id);
    }
}


