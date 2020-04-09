package CoffeeMaker.Condiment;

import CoffeeMaker.CoffeeOS;

public class CondimentCream extends AbstractCondiment{
    //double price = 0.25;
    private CondimentIF environment;

    public void setEnvironment(CondimentIF environment) {
        this.environment = (CondimentIF) this;
    }

    public void add(CoffeeOS x) {

    }

}
