package Coffee;

import java.net.URLClassLoader;

public class AbstractCoffee {
    public void setChosenCoffeeType(CoffeeIF.CoffeeType type) { //throws ClassNot(???)
        String compiledClassLocation = new File(".").getCanonicalPath();
        System.out.println(compiledClassLocation);
        URL[] classPath = (newFile(compiledClassLocation).toURI().toURL());
        ClassLoader cLoader = new URLClassLoader(classPath);

        //another way to use classholder:
        //ClassLoader cLoader = this.getClass().getClassLoader();

        Class c = null;
        switch (type) {
            case Regular:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeRegular");
                break;
            case Mocha:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeMocha");
                break;
            case Latte:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeLatte");
                break;
            case Espresso:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeEspresso");
                break;
            case Cappuccino:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeCappuccino");
                break;
        }
    }
}
