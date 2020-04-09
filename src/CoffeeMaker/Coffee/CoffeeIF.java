package CoffeeMaker.Coffee;

public interface CoffeeIF {

    public enum CoffeeType{
        Regular, Mocha, Latte, Espresso, Cappuccino;
    }

    public void setEnvironment(CoffeeMaker.Coffee.CoffeeIF environment); //??
    public void start(CoffeeMaker.CoffeeOS x);
}
