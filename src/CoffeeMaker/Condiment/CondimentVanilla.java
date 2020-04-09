package CoffeeMaker.Condiment;

import CoffeeMaker.CoffeeOS;

public class CondimentVanilla {
    //double price = 0.50;
    private CondimentIF environment;

    public void setEnvironment(CondimentIF environment) {
        this.environment = (CondimentIF) this;
    }

    public void add(CoffeeOS x) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        ClassLoader cLoader = this.getClass().getClassLoader();

        Class c = null;
        c = cLoader.loadClass("CoffeeMaker.Condiment.Vanilla");
        CoffeeMaker.Condiment.CondimentCream d = (CondimentCream) c.newInstance();
        d.add(this);
    }

}
