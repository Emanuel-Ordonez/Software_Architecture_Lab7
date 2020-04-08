package CoffeeMaker.Coffee;

import CoffeeMaker.CoffeeOS_API;

public class CoffeeRegular extends AbstractCoffee{

    private CoffeeIF environment;

    @Override
    public void setEnvironment(CoffeeIF environment) {
        this.environment = environment;
    }

    public void start()
    {
        //Indicate the machine is running display purchased type of coffee to LED
        System.out.println("Now brewing \"Regular\"...");
        //Grind coffee beans for 8 seconds
//        CoffeeMaker.CoffeeOS.setGrindingTime(8);
//        //Heat up water to 150 degrees Fahrenheit
//        CoffeeMaker.CoffeeOS.setTemperature(150);
//        //Hold the temperature for 2 seconds
//        CoffeeMaker.CoffeeOS.holdTemperature(2);
//        //After 15 seconds, set the LED to indicate the machine is not running
//        CoffeeMaker.CoffeeOS.wait(15);
//        CoffeeMaker.CoffeeOS.setPowerLED(1); //power off
    }
}
