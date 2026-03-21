package AbstractionAndInterface.CarDashboard;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new ElectricCar(75));
        for(Vehicle v:vehicles){
            v.displaySpeed();
            v.displayBattery();
            System.out.println();
        }
    }
}