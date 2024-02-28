package pizza;

import java.util.ArrayList;
import java.util.List;

public class AbstractPizza {

    protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;
    protected List<Toppings> toppingsList;

    public AbstractPizza() {
        this.toppingsList= new ArrayList<Toppings>();
    }
    
    public List<Toppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public double getPriceWithoutToppings() {
        return priceWithoutToppings;
    }

    public void setPriceWithoutToppings(double priceWithoutToppings) {
        this.priceWithoutToppings = priceWithoutToppings;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPizzaOrderID() {
        return pizzaOrderID;
    }

    public void setPizzaOrderID(int pizzaOrderID) {
        this.pizzaOrderID = pizzaOrderID;
    }

    public ICookingStrategy getCookingStrategy() {
        return cookingStrategy;
    }

    public void setCookingStrategy(ICookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public double getCookingPrice() {
        return cookingPrice;
    }

    public void setCookingPrice(double cookingPrice) {
        this.cookingPrice = cookingPrice;
    }
}
