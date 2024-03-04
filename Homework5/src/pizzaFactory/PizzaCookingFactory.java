package pizzaFactory;

import pizza.AbstractPizza;
import pizza.HawaiianPizza;
import pizza.MargheritaPizza;
import pizza.PizzaType;
import pizza.SupremePizza;
import pizza.VegetarianPizza;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		//Declare pizza to create
		AbstractPizza pizza;
		
        //If pizzaType is HAWAIIAN
		if(pizzaType == PizzaType.HAWAIIAN){
			//Create new Hawaiian Pizza
			pizza = new HawaiianPizza();
			
			//Set order ID by using the current orderIDCounter
			AbstractPizza.setPizzaOrderID(AbstractPizza.getorderIDCounter());
			
			//Increment orderIDCounter
			AbstractPizza.setorderIDCounter((AbstractPizza.getorderIDCounter)+1);
			
			//Return pizza
			return pizza;
		}
		
		//Else if pizzaType is MARGHERITA
		else if(pizzaType == PizzaType.MARGHERITA){
			//Create new Margherita Pizza
			pizza = new MargheritaPizza();
			
			//Set order ID by using the current orderIDCounter
			AbstractPizza.setPizzaOrderID(AbstractPizza.getorderIDCounter());
			
			//Increment orderIDCounter
			AbstractPizza.setorderIDCounter((AbstractPizza.getorderIDCounter)+1);
			
			//Return pizza
			return pizza;
		}
		
		//Else if pizzaType is SUPREME
		else if(pizzaType == PizzaType.SUPREME){
			//Create new Supreme Pizza
			pizza = new SupremePizza();
			
			//Set order ID by using the current orderIDCounter
			AbstractPizza.setPizzaOrderID(AbstractPizza.getorderIDCounter());
			
			//Increment orderIDCounter
			AbstractPizza.setorderIDCounter((AbstractPizza.getorderIDCounter)+1);
			
			//Return pizza
			return pizza;
		}
		
		//Else if pizzaType is VEGETARIAN
		else if(pizzaType == PizzaType.VEGETARIAN){
			//Create new Vegetarian Pizza
			pizza = new VegetarianPizza();
			
			//Set order ID by using the current orderIDCounter
			AbstractPizza.setPizzaOrderID(AbstractPizza.getorderIDCounter());
			
			//Increment orderIDCounter
			AbstractPizza.setorderIDCounter((AbstractPizza.getorderIDCounter)+1);
			
			//Return pizza
			return pizza;
		}
		
		//If pizza type is not found, print error message
		else {
			System.out.println("Pizza Type not found. Pizza could not be created.");
		}
	}

}
