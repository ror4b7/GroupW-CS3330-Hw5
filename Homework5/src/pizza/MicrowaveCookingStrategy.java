package pizza;

public class MicrowaveCookingStrategy  implements ICookingStrategy
{

    //Takes a pizza as input and then stes its cooking strartgey to current, updates cooking price and totalPrice 
    @Override
    public boolean cook(AbstractPizza pizza)
    {
        
        pizza.setCookingStrategy(this);
        pizza.setCookingPrice(1.0);
        pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
        return true;
       
    }
}
