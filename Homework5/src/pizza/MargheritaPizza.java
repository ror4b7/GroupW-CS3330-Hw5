package pizza;

import java.util.ArrayList;

public class MargheritaPizza  extends AbstractPizza
{


    //Normal Constructor
    public MargheritaPizza() {
        super();
        addDefaultToppings();
        this.priceWithoutToppings = 2.50; 
        this.totalPrice = addTopingsToPrice(priceWithoutToppings) + priceWithoutToppings; 
    }



    
    //Addds the deafult toppings
    protected void addDefaultToppings() {
        this.toppingsList.add(Toppings.TOMATO); 
        this.toppingsList.add(Toppings.CHEESE); 
    }


    //Copy COnstrcutor 
    public MargheritaPizza(MargheritaPizza ogPizza) {
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
		return "Margherita Pizza: [priceWithoutToppings=" + priceWithoutToppings + ", totalPrice=" + totalPrice
				+ ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy=" + cookingStrategy + ", cookingPrice="
				+ cookingPrice + ", toppingsList=" + toppingsList + "]";
	}
}

   