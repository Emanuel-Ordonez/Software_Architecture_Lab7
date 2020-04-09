package CoffeeMaker;

import CoffeeMaker.Coffee.CoffeeIF;
import CoffeeMaker.Coffee.CoffeeIF.CoffeeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeOS implements CoffeeOS_API{

    private double LED; //LED light (see menu() notes for more)
        public void setLED(double n){LED = n;}
        public double getLED(){return LED;}
    private List<CoffeeIF> ListOfSales = new ArrayList<CoffeeIF>();


    public void menu() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
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
        setLED(1.0); //not running, no coffee selected
        int choice = 0; //choice to be used in menu
        Scanner in = new Scanner(System.in);

        do { //menu to choice coffee type (choice = 1-5)
            System.out.println("---- Welcome to the Coffee Making Machine ---");
            System.out.println("---- Please press a number to select a coffee type below:\n");

            System.out.println("\t1 - Regular ($1)");
            System.out.println("\t2 - Mocha ($2)");
            System.out.println("\t3 - Latte ($3)");
            System.out.println("\t4 - Espresso ($4)");
            System.out.println("\t5 - Cappuccino ($5)");
            System.out.println("\n");

            choice = in.nextInt();
        }while(LED < 1.0 && (choice >= 1 && choice <= 5));

        CoffeeIF.CoffeeType coffeeType = null;
        switch(choice){ //convert choice to coffee type string
            case 1:coffeeType=CoffeeIF.CoffeeType.Regular;setLED(1.1);break;
            case 2:coffeeType=CoffeeIF.CoffeeType.Mocha;setLED(1.2);break;
            case 3:coffeeType=CoffeeIF.CoffeeType.Latte;setLED(1.2);break;
            case 4:coffeeType=CoffeeIF.CoffeeType.Espresso;setLED(1.4);break;
            case 5:coffeeType=CoffeeIF.CoffeeType.Cappuccino;setLED(1.5);break;
            default:System.out.println("ERROR: INVALID CHOICE; SEE menu()");done();
        }
        setCoffeeType(coffeeType);
    }//END menu()

//    public void setCoffeeType(String type) throws ClassNotFoundException {
//        ClassLoader cLoader = this.getClass().getClassLoader();
//        Class c = null;
//        switch (type) {
//            case "Regular":
//                c = cLoader.loadClass("CoffeeMaker.srcpkg.Coffee.CoffeeRegular");
//                break;
//            case "Mocha":
//                c = cLoader.loadClass("CoffeeMaker.srcpkg.Coffee.CoffeeMocha");
//                break;
//            case "Latte":
//                c = cLoader.loadClass("CoffeeMaker.srcpkg.Coffee.CoffeeLatte");
//                break;
//            case "Espresso":
//                c = cLoader.loadClass("CoffeeMaker.srcpkg.Coffee.CoffeeEspresso");
//                break;
//            case "Cappuccino":
//                c = cLoader.loadClass("CoffeeMaker.srcpkg.Coffee.CoffeeCappuccino");
//                break;
//        }
//    }//end setCoffeeType(String type)

    public void setCoffeeType (CoffeeIF.CoffeeType type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        String compiledClassLocation = new File(".").getCanonicalPath();
//        System.out.println(compiledClassLocation);
//        URL[] classPath = (newFile(compiledClassLocation).toURI().toURL());
//        ClassLoader cLoader = new URLClassLoader(classPath);
        //^^^ another way to use class holder

        ClassLoader cLoader = this.getClass().getClassLoader();

        Class c = null;
        switch (type) {
            case Regular:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeRegular");
                CoffeeMaker.Coffee.CoffeeRegular l = new CoffeeMaker.Coffee.CoffeeRegular();
                l.start(this);
                System.out.println("loading regular class...");
                break;
            case Mocha:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeMocha");
                CoffeeMaker.Coffee.CoffeeMocha v = new CoffeeMaker.Coffee.CoffeeMocha();
                v.start(this);
                System.out.println("loading mocha class...");
                break;
            case Latte:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeLatte");
                CoffeeMaker.Coffee.CoffeeLatte y = new CoffeeMaker.Coffee.CoffeeLatte();
                y.start(this);
                System.out.println("loading latte class...");
                break;
            case Espresso:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeEspresso");
                CoffeeMaker.Coffee.CoffeeEspresso z = new CoffeeMaker.Coffee.CoffeeEspresso();
                z.start(this);
                System.out.println("loading espresso class...");
                break;
            case Cappuccino:
                c = cLoader.loadClass("CoffeeMaker.Coffee.CoffeeCappuccino");
                CoffeeMaker.Coffee.CoffeeCappuccino h = new CoffeeMaker.Coffee.CoffeeCappuccino();
                h.start(this);
                System.out.println("loading cappuccino class...");
                break;
        }

//        CoffeeIF coffeeOrders;// =  null;
//        assert c != null;
//        coffeeOrders = (CoffeeIF) c.newInstance();
//        coffeeOrders.setEnvironment(this);

    }//end setChosenCoffeeType()

    ////////////////////////////////////////////////////////////////////////////////

    public void setCoffeeType(String str) {
        System.out.println("Chosen coffee type: " + str);
    }

    public void setGrindingTime(int secs) {
        System.out.println("Setting grinding time to " + secs + " seconds");
    }

    public void addCondiment(int type){
        System.out.println("Adding condiments");
    }

    public void setTemperature(int degree){
        System.out.println("Setting temperature to " + degree + " degrees Fahrenheit");
    }

    public void holdTemperature(int seconds){
        System.out.println("Holding temperature for " + seconds + " seconds");
    }

    public void wait(int seconds){
        System.out.println("Waiting for "+ seconds +" seconds");
    }//end wati()

    public void setPowerLED(int num){
        System.out.println("Setting Power LED to " + num);
    }//end setPowerLED

    public void setTypeLED(int num){
        System.out.println("Setting LED type to " + num);
    }//end setTypeLED

    public void computePrice(CoffeeIF cif){
        double price = 0.00;
//        switch (cif.CoffeeType) {
//            case Regular:
//                price = 1.00;
//                break;
//            case Mocha:
//                price = 2.00;
//                break;
//            case Latte:
//                price = 3.00;
//                break;
//            case Espresso:
//                price = 4.00;
//                break;
//            case Cappuccino:
//                price = 5.00;
//                break;
//        }
    }//end computePrice()

    public void done(){}

    public void run() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        menu();
    }

}
