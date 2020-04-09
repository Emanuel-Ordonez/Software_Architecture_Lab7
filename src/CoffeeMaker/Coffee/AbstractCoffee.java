package CoffeeMaker.Coffee;

public abstract class AbstractCoffee implements CoffeeIF{

    private CoffeeIF environment;

    public abstract void setEnvironment(CoffeeIF environment);
    public abstract void start(CoffeeMaker.CoffeeOS x);
}
