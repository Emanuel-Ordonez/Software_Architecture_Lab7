package CoffeeMaker.Condiment;

public interface CondimentIF {

    public enum CondimentType{
       Vanilla, Cream, Chocolate;
    }

    public void setEnvironment(CoffeeMaker.Condiment.CondimentIF environment); //??
    public void add(CoffeeMaker.CoffeeOS x);

}
