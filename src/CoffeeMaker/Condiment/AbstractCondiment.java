package CoffeeMaker.Condiment;

import CoffeeMaker.CoffeeOS;

public abstract class AbstractCondiment implements CondimentIF{

    private CondimentIF environment;

    public abstract void setEnvironment(CondimentIF environment);
    public abstract void add(CoffeeOS x);

    public abstract void add(CondimentVanilla condimentVanilla);
}