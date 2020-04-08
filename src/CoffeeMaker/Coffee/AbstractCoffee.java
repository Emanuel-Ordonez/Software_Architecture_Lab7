package CoffeeMaker.Coffee;

public abstract class AbstractCoffee implements CoffeeIF{

    private CoffeeIF environment;

    public void setEnvironment(CoffeeIF environment){
        this.environment = environment;
    }

    public abstract void start();
}
