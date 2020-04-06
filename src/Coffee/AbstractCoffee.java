package Coffee;

import java.net.URLClassLoader;

public abstract class AbstractCoffee {
    private CoffeeIF environment;

    public void setEnvironment(CoffeeIF environment){
        this.environment = environment;
    }

    protected CoffeeIF getEnvironment(){
        return environment;
    }

    public abstract String getName();
    public abstract void start();
}
