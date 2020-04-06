import Coffee.CoffeeIF;
import java.util.Scanner;

public class CoffeeMachine {

    Scanner in = new Scanner(System.in);

    public void menu() throws ClassNotFoundException {
        /*LED light has two digits:
            first digit:
                0 -- running
                1 -- not running
            second digit:
                1 - Regular
                2 - Mocha
                3 - Latte
                4 - Espresso
                5 - Cappuccino
         */
        double LED = 1.0; //not running, no coffee selected
        int choice = 0; //choice to be used in menu

        do { //menu to choice coffee type (choice = 1-5)
            System.out.println("---- Welcome to the Coffee Making Machine ---");
            System.out.println("---- Please press a number to select a coffee type below:\n");

            System.out.println("\t1 - Regular ($1)");
            System.out.println("\t2 - Mocha ($2)");
            System.out.println("\t3 - Latte ($3)");
            System.out.println("\t4 - Espresso ($4)");
            System.out.println("\t5 - Cappuccino ($5)");

            choice = in.nextInt();
        }while(LED < 1.0 && (choice >= 1 && choice <= 5));

        String coffeeType = "";
        switch(choice){ //convert choice to coffee type string
            case 1: coffeeType = "Regular"; LED = 1.1; break;
            case 2: coffeeType = "Mocha"; LED = 1.2; break;
            case 3: coffeeType = "Latte"; LED = 1.3; break;
            case 4: coffeeType = "Espresso"; LED = 1.4; break;
            case 5: coffeeType = "Cappuccino"; LED = 1.5; break;
            default: System.out.println("ERROR: INVALID CHOICE; SEE menu()"); done();
        }

        setCoffeeType(coffeeType);
    }

    public void setCoffeeType(String type) throws ClassNotFoundException {

        ClassLoader cLoader = this.getClass().getClassLoader();
        Class c = null;
        switch (type) {
            case "Regular":
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeRegular");
                break;
            case "Mocha":
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeMocha");
                break;
            case "Latte":
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeLatte");
                break;
            case "Espresso":
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeEspresso");
                break;
            case "Cappuccino":
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeCappuccino");
                break;
        }
    }//end setCoffeeType(String type)


//        public void setChosenCoffeeType (CoffeeIF.CoffeeType type) throws ClassNotFoundException {
//        String compiledClassLocation = new File(".").getCanonicalPath();
//        System.out.println(compiledClassLocation);
//        URL[] classPath = (newFile(compiledClassLocation).toURI().toURL());
//        ClassLoader cLoader = new URLClassLoader(classPath);
//
//        //another way to use classholder:
//        //ClassLoader cLoader = this.getClass().getClassLoader();
//
//        Class c = null;
//        switch (type) {
//            case Regular:
//                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeRegular");
//                break;
//            case Mocha:
//                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeMocha");
//                break;
//            case Latte:
//                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeLatte");
//                break;
//            case Espresso:
//                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeEspresso");
//                break;
//            case Cappuccino:
//                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeCappuccino");
//                break;
//        }
//    }//end setChosenCoffeeType(CoffeeIF.CoffeeType type)

    ////////////////////////////////////////////////////////////////////////////////

//    public void setCoffeeType(String str) {
//        System.out.println("Chosen coffee type: " + str);
//    }

    public void setGrindingTime(int secs) {
        System.out.println("Setting grinding time to " + secs + " seconds");
    }

    public void addCondiment(int type){
        System.out.println("Adding condiments");
    }

    public void setTemperature(int degree){
        System.out.println("Setting temperature to "+ degree +" degrees Fahrenheit");
    }

    public void holdTemperature(int seconds){
        System.out.println("Holding temperature for "+ seconds +" seconds");
    }

    public void wait(int seconds){
        System.out.println("Waiting for "+ seconds +" seconds");
    }

    public void setPowerLED(int num){
        System.out.println("Setting Power LED to " + num);
    }

    public void setTypeLED(int num){
        System.out.println("Setting LED type to " + num);
    }

    public void computePrice(CoffeeIF cif){
        System.out.println("\t[in CoffeeMachine.computePrice()");
    }

    public void done(){};
}//end CoffeeMachineClass
