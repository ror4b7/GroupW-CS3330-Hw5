package pizza;

import java.util.ArrayList;

public class HawaiianPizza extends AbstractPizza {


     //Normal Constructor
    public HawaiianPizza() {
        super();
        addDefaultToppings();
        this.priceWithoutToppings =  1.50 * 2; 
        this.totalPrice = addTopingsToPrice(priceWithoutToppings) + priceWithoutToppings; 
    }



    
    //Addds the deafult toppings

    //TOMATO, CHEESE, BELL_PEPPER, ITALIAN_SAUSAGE, PEPPERONI, BLACK_OLIVE, MUSHROOM
    protected void addDefaultToppings() {
        this.toppingsList.add(Toppings.CANADIAN_BACON); 
        this.toppingsList.add(Toppings.CHEESE); 
        this.toppingsList.add(Toppings.PINEAPPLE);
    }


    //Copy COnstrcutor 
    public HawaiianPizza(HawaiianPizza ogPizza) {
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
