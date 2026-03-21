package AbstractionAndInterface.SmartDevices;
public class AC implements SmartDevice{
    public void turnOn(){
        System.out.println("AC is ON");
    }
    public void turnOff(){
        System.out.println("AC is OFF");
    }
}