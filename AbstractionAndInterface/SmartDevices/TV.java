package AbstractionAndInterface.SmartDevices;
public class TV implements SmartDevice{
    public void turnOn(){
        System.out.println("TV is ON");
    }
    public void turnOff(){
        System.out.println("TV is OFF");
    }
}