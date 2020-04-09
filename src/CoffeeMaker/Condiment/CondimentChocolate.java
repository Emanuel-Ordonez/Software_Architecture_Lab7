package CoffeeMaker.Condiment;

import CoffeeMaker.CoffeeOS;

public class CondimentChocolate extends AbstractCondiment{

    private CondimentIF environment;

    public void setEnvironment(CondimentIF environment) {
        this.environment = (CondimentIF) this;
    }

    public void add(CoffeeOS x) {

    }

}
