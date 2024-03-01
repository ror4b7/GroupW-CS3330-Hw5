package pizza;

import java.util.ArrayList;

public class VegetarianPizza  extends AbstractPizza
{
     //Normal Constructor
    public VegetarianPizza() {
        super();
        addDefaultToppings();
        this.priceWithoutToppings =  1.50; 
        this.totalPrice = addTopingsToPrice(priceWithoutToppings) + priceWithoutToppings; 
    }



    
    //Addds the deafult toppings

    //TOMATO, CHEESE, BELL_PEPPER, ITALIAN_SAUSAGE, PEPPERONI, BLACK_OLIVE, MUSHROOM
    protected void addDefaultToppings() {
        this.toppingsList.add(Toppings.TOMATO); 
        this.toppingsList.add(Toppings.CHEESE); 
        this.toppingsList.add(Toppings.BELL_PEPPER);
        this.toppingsList.add(Toppings.BLACK_OLIVE);
        this.toppingsList.add(Toppings.MUSHROOM);
    }


    //Copy COnstrcutor 
    public VegetarianPizza(VegetarianPizza ogPizza) {
        super();
        this.toppingsList = new ArrayList<>(ogPizza.toppingsList);
        this.priceWithoutToppings = ogPizza.priceWithoutToppings;
        this.totalPrice =  ogPizza.totalPrice;
        this.pizzaOrderID = ogPizza.pizzaOrderID;
    }

    
    //This function takes priceWithouTopping and calcutes the toppings price
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
    public double updatePizzaPrice()
    {
        totalPrice = addTopingsToPrice(priceWithoutToppings) + priceWithoutToppings; 
        return totalPrice; 
    }
}
