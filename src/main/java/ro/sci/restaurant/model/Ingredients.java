package ro.sci.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "stock")
public class Ingredients extends AbstractEntity {                           //TODO am adaugat abstract entity aici


    private String item;
    private int quantity;

    public Ingredients() {

    }

    public Ingredients(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Column(name = "items")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
