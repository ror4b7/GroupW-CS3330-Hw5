package pizzaFactory;

import java.util.List;

import pizza.AbstractPizza;
import pizza.ICookingStrategy;
import pizza.Toppings;

public class PizzaOrder {

    //private attributes to be managed
    private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy;
    private List<AbstractPizza> pizzaOrderList;

    //constructor with pizzaFactory and pizzaOrderList instantiated
    public PizzaOrder(PizzaCookingFactory pizzaFactory, List<AbstractPizza> pizzaOrderList) {
        this.pizzaFactory=pizzaFactory;
        this.pizzaOrderList=pizzaOrderList;
    }

    /*This function takes into account the order ID of a pizza and prints
     * out its designated toppings. If there is no pizza with the given order
     * ID, the program prints out a message saying as much.
     */
    public void printListOfToppingsByPizzaOrderID(int orderID) {
        
        //cycles through pizzaOrderList
        for(AbstractPizza pizza: pizzaOrderList) {
            //checking if the orderID matches
            if(pizza.getOrderID()!=orderID) {
                continue;
            }
            
            //if we find a match, we print out each individual topping
            else if (pizza.getOrderID()==orderID){
                for(Toppings topping: pizza.getToppingList()) {
                    System.out.println(topping.toString());
                }
            }
            
            //if there is no match, we print out a message saying as much
            else {
            System.out.println("\nSorry, but there is no pizza with that order ID.");
            }
        }
    }
}
