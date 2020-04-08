package CoffeeMaker.Coffee;

public interface CoffeeIF {

    public enum CoffeeType{
        Regular, Mocha, Latte, Espresso, Cappuccino;
    }

    public void setEnvironment(CoffeeMaker.CoffeeOS_API environment); //??
    public void start();
}
