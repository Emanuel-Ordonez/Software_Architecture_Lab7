package CoffeeMaker.Coffee;

public class CoffeeMocha extends AbstractCoffee{

    private CoffeeIF environment;

    @Override
    public void setEnvironment(CoffeeIF environment) {
        this.environment = environment;
    }


    public void start(CoffeeMaker.CoffeeOS x)
    {
        //Indicate the machine is running display purchased type of coffee to LED
        System.out.println("Now brewing \"Mocha\"...");
//        //Grind coffee beans for 8 seconds
        x.setGrindingTime(5);
//        //Heat up water to 150 degrees Fahrenheit
        x.setTemperature(200);
//        //Hold the temperature for 2 seconds
        x.holdTemperature(5);
//        //After 15 seconds, set the LED to indicate the machine is not running
        x.wait(15);
        x.setPowerLED(1); //power off
    }
}
