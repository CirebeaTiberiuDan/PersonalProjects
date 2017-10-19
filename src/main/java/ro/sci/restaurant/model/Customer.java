package ro.sci.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
//@Table(name = "customers")
public class Customer extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


    public Customer(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastName = lastname;

    }

    public Customer() {
    }

    @NotNull
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    @SuppressWarnings("unused")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    @SuppressWarnings("unused")
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }


    @NotNull
    @Column(name = "email", unique = true)
    public String getEmail() {
        return email;
    }

    @SuppressWarnings("unused")
    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull
    @Column(name = "phone_number", unique = true)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @SuppressWarnings("unused")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

