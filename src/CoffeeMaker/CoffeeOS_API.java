package CoffeeMaker;

import CoffeeMaker.Coffee.CoffeeIF;

public interface CoffeeOS_API {
    public void setCoffeeType(String str);
    public void setGrindingTime(int secs);
    public void addCondiment();
    public void setTemperature(int degree);
    public void holdTemperature(int seconds);
    public void wait(int seconds);
    public void setPowerLED(int num);
    public void setTypeLED(int num);
    public void computePrice(CoffeeIF cif);
    public void done();
    public void run() throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
