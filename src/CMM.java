public class CMM {
    public void setCoffeeType(String str){
        System.out.println("Chosen coffee type: "+str);
    }

    public void setGrindingTime(int secs){
        System.out.println("Setting grinding time to "+ secs +" seconds");
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
}
