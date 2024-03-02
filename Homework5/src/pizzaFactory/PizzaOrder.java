package pizzaFactory;

import java.util.List;

import pizza.AbstractPizza;
import pizza.BrickOvenCookingStrategy;
import pizza.ConventionalOvenCookingStrategy;
import pizza.CookingStyleType;
import pizza.ICookingStrategy;
import pizza.MicrowaveCookingStrategy;
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
            if(pizza.getPizzaOrderID()!=orderID) {
                continue;
            }
            
            //if we find a match, we print out each individual topping
            else if (pizza.getPizzaOrderID()==orderID){
                for(Toppings topping: pizza.getToppingsList()) {
                    System.out.println(topping.toString());
                }
            }
            
            //if there is no match, we print out a message saying as much
            else {
            System.out.println("\nSorry, but there is no pizza with that order ID.");
            }
        }
    }
    
    /*This function checks if there are any uncooked pizzas in the list. If there are,
     * the function returns true; otherwise, it returns false.
     */
    public boolean isThereAnyUncookedPizza() {

        //cycling through pizzaOrderList
        for(AbstractPizza pizza: pizzaOrderList) {
            if(pizza.getCookingStrategy()==null) {
                //checking for any uncooked pizzas
                return true;
            }
        }

        //elif all pizzas are cooked
        return false;
    }

    /*In this function, we check to see if there are any uncooked pizzas via
     * the prior function, isThereAnyUncookedPizza(). If there are, this function
     * will throw a general exception, warning that there are still pizzas to be
     * cooked. Otherwise, it will return the total cost of all pizzas in the cart.
    */
    public double checkout() throws Exception {
        
        //variables used in the function
        boolean cookCheck = isThereAnyUncookedPizza();
        double cartTotal = 0.0;

        //in the case there is an uncooked pizza, the function throws a general Exception
        if(cookCheck==true) {
            throw new Exception("Not all pizzas have been cooked yet!");
        }

        //if all pizzas are cooked, the total price is added up and returned
        else {
            for(AbstractPizza pizza: pizzaOrderList) {
                cartTotal = cartTotal + pizza.getTotalPrice();
            }
        }
        return cartTotal;
    }

    /*In this function, we find the pizza in the list with the given orderID (if it
     * exists) and cook it based on the assigned cookingStrategyType. We then return
     * the boolean result from the cook() function.
    */
    public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
        
        boolean result = false;

        //cycling through the pizzas in the list
        for(AbstractPizza pizza: pizzaOrderList) {   
            
            //if the orderID does not match the one given, proceed through the list 
            if(pizza.getPizzaOrderID()!=orderID) {
                continue;
            }

            else {
                //determining cooking strategy based on the given cookingStrategyType
                switch (cookingStrategyType) {
                    case CONVENTIONAL_OVEN:
                        cookingStrategy = new ConventionalOvenCookingStrategy();
                        break;
                
                    case BRICK_OVEN:
                        cookingStrategy = new BrickOvenCookingStrategy();
                        break;

                    case MICROWAVE:
                        cookingStrategy = new MicrowaveCookingStrategy();
                        break;

                    default:
                        break;
                }
                cookingStrategy.cook(pizza);
                return result;
            }
        }

        //error message in the case that there is no pizza with the given ID
        System.out.println("There is no pizza with the order ID " + orderID + "in this list.");
        return result;
    }
}
