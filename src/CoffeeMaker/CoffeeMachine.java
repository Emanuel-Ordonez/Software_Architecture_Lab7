package CoffeeMaker;

public class CoffeeMachine {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        CoffeeOS covfefe = new CoffeeOS();
        covfefe.run();
        System.out.println("Bill... we've got numbers!");
        done();
    }

    public static void done(){};

}//end CoffeeMachineClass
