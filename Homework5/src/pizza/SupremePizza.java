package pizza;

import java.util.ArrayList;

public class SupremePizza  extends AbstractPizza
{
    

    //Normal Constructor
    public SupremePizza() {
        super();
        addDefaultToppings();
        this.priceWithoutToppings =  3.50; 
        this.totalPrice = addTopingsToPrice(priceWithoutToppings) + priceWithoutToppings; 
    }



    
    //Addds the deafult toppings

    //TOMATO, CHEESE, BELL_PEPPER, ITALIAN_SAUSAGE, PEPPERONI, BLACK_OLIVE, MUSHROOM
    protected void addDefaultToppings() {
        this.toppingsList.add(Toppings.TOMATO); 
        this.toppingsList.add(Toppings.CHEESE); 
        this.toppingsList.add(Toppings.BELL_PEPPER);
        this.toppingsList.add(Toppings.ITALIAN_SAUSAGE);
        this.toppingsList.add(Toppings.PEPPERONI);
        this.toppingsList.add(Toppings.BLACK_OLIVE);
        this.toppingsList.add(Toppings.MUSHROOM);
    }


    //Copy COnstrcutor 
    public SupremePizza(SupremePizza ogPizza) {
        super();
        this.toppingsList = new ArrayList<>(ogPizza.toppingsList);
        this.priceWithoutToppings = ogPizza.priceWithoutToppings;
        this.totalPrice =  ogPizza.totalPrice;
        this.pizzaOrderID = ogPizza.pizzaOrderID;
    }

    
    //This function takes priceWithouTopping and calcutes the toppings price
    @Override
    protected double addTopingsToPrice(double priceWithoutToppings)
    {
       double toppingsPrice = 0; 
        
        for (Toppings top : toppingsList)
        {
            toppingsPrice += top.getToppingPrice(); 
        }

        this.totalPrice = toppingsPrice + priceWithoutToppings; 

        return toppingsPrice; 
    }


    //THis function upates the total price function by adding together addToppingsPrice to priceWithoutTOppings
    @Override
    public double updatePizzaPrice()
    {
        totalPrice = addTopingsToPrice(priceWithoutToppings) + priceWithoutToppings; 
        return totalPrice; 
    }
    
	@Override
	public String toString() {
		return "Supreme Pizza: [priceWithoutToppings=" + priceWithoutToppings + ", totalPrice=" + totalPrice
				+ ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy=" + cookingStrategy + ", cookingPrice="
				+ cookingPrice + ", toppingsList=" + toppingsList + "]";
	}


}
