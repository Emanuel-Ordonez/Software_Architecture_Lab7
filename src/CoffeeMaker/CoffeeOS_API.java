package CoffeeMaker;

import CoffeeMaker.Coffee.*;

import java.util.Scanner;

public interface CoffeeOS_API {
    public void menu() throws ClassNotFoundException, InstantiationException, IllegalAccessException ;
    public void setCoffeeType (CoffeeIF.CoffeeType type) throws ClassNotFoundException, IllegalAccessException, InstantiationException ;
    public void setGrindingTime(int secs);
    public void addCondiment(int type);
    public void setTemperature(int degree);
    public void holdTemperature(int seconds);
    public void wait(int seconds);
    public void setPowerLED(int num);
    public void setTypeLED(int num);
    public void computePrice(double price);
    public void done();
    public void run() throws ClassNotFoundException, IllegalAccessException, InstantiationException ;
}
