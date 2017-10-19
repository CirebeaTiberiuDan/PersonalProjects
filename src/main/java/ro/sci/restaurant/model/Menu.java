package ro.sci.restaurant.model;

import javax.persistence.Entity;

/**
 * Created by cosmin on 9/25/17.
 */
//
@Entity/////ORDER
public class Menu extends AbstractEntity {

    private String dishName;
    private int dishPrice;
    //private List<Ingredients> ingredients;
    //private Ingredients ingredients;
    //private Map<Item,Integer> ingredientQuantity = new HashMap<>();

    public Menu() {
    }

    public Menu(String dishName, String dishPrice) {
        this.dishName = dishName;
        this.dishPrice = Integer.parseInt(dishPrice);
    }

//    public Menu(String dishName, int dishPrice, Ingredients ingrediens) {
//        this.dishName = dishName;
//        this.dishPrice = dishPrice;
//        this.ingredients = ingredients;
//    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }


    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    /*
    @ElementCollection
    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
    */
}
