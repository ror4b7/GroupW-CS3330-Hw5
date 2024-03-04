package pizza;

public class BrickOvenCookingStrategy implements ICookingStrategy {


    //Takes a pizza as input and then sets its cooking strategy to current, updates cooking price and totalPrice.
    @Override
    public boolean cook(AbstractPizza pizza)
    {
        
        pizza.setCookingStrategy(this);
        pizza.setCookingPrice(10.0);
        pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
        return true;
       
    }

}
