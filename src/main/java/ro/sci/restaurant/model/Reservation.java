package ro.sci.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation extends AbstractEntity {

    private Customer customer;
    private Date reservationDate;
//    private List<Table> tables;


    public Reservation() {
    }

    public Reservation(Customer customer, Date reservationDate) {
        this.customer = customer;
        this.reservationDate = reservationDate;
    }

    @Transient
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Column(name = "reservation_date")
    public Date getReservationDate() {
        return reservationDate;
    }

    @SuppressWarnings("unused")
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

//    @ElementCollection
//    public List<Table> getTables() {
//        return tables;
//    }
//
//    public void setTables(List<Table> tables) {
//        this.tables = tables;
//    }
}
