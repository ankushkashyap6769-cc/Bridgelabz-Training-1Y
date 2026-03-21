package AbstractionAndInterface.SmartDevices;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<SmartDevice> devices=new ArrayList<>();
        devices.add(new Light());
        devices.add(new AC());
        devices.add(new TV());
        for(SmartDevice d:devices){
            d.turnOn();
            d.turnOff();
            System.out.println();
        }
    }
}