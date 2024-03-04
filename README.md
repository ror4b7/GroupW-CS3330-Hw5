Overview: This project is an automation of a Pizza Store. It involves the implementation of Factory and Strategy design patterns, Enum classes with methods, and assigning values to enums

Instructions to run program:
1. Clone or fork the repository to your local machine
2. Open the Homework5 folder in Eclipse
3. Run Main.java

Trey:
- MargheritaPizza, VegetarianPizza, HawaiianPizza, and SupremePizza subclasses
- protected double addTopingsToPrice(double priceWithoutToppings)
- public double updatePizzaPrice()
- ICookingStrategy: public boolean cook(AbstractPizza pizza)
- Implementations of BrickOvenCookingStrategy, ConventionalOvenCookingStrategy, and MicrowaveCookingStrategy

Justice:
- printListOfToppingsByPizzaOrderID(int orderID)
- public AbstractPizza getPizzaByOrderID(int orderID)
- public boolean addPizzaToCart(PizzaType pizzaType)
- public boolean addNewToppingToPizza(int orderID, Toppings topping)
- public boolean removeToppingFromPizza(int orderID, Toppings topping)

Rachel:
- public AbstractPizza createPizza(PizzaType pizzaType)
- Toppings Enum
- PizzaType Enum
- CookingStyleType Enum
- Main Class & Readme

Kaitlyn:
- AbstractPizza Class
- PizzaOrder Class
- public boolean isThereAnyUncookedPizza()
- public double checkout() throws Exception
- public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType)
