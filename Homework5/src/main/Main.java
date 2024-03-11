package main;

import java.util.ArrayList;

import pizza.CookingStyleType;
import pizza.PizzaType;
import pizzaFactory.PizzaCookingFactory;
import pizzaFactory.PizzaOrder;

public class Main {
	public static void main(String[] args) {
		
		
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder(new PizzaCookingFactory(), new ArrayList<>());
		
		//Adds pizzas to the cart
        order.addPizzaToCart(PizzaType.HAWAIIAN);
        order.addPizzaToCart(PizzaType.MARGHERITA);
        order.addPizzaToCart(PizzaType.SUPREME);
        order.addPizzaToCart(PizzaType.VEGETARIAN);
        order.addPizzaToCart(PizzaType.HAWAIIAN);
        
		
		//Selects cooking strategies for the pizzas in the cart
        order.selectCookingStrategyByPizzaOrderID(0, CookingStyleType.BRICK_OVEN);
        order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.CONVENTIONAL_OVEN);
        order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.MICROWAVE);
        order.selectCookingStrategyByPizzaOrderID(3, CookingStyleType.BRICK_OVEN);
        order.selectCookingStrategyByPizzaOrderID(4, CookingStyleType.CONVENTIONAL_OVEN);
		
		//Prints pizza order cart
        System.out.println("Pizzas In Cart:");
        order.printPizzaOrderCart(1);
		
		//Calls checkout to calculate the bill, throws exception if triggered.
        try {
        	double totalBill = order.checkout();
            System.out.println("");
            System.out.println("Total Bill: $" + totalBill);
        } catch (Exception e) {
            //Gets exception message if thrown
            System.out.println("Error: " + e.getMessage());
        }
	}
}
