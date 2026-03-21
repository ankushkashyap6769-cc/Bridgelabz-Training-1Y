package AbstractionAndInterface.Vehicle;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Rentable> vehicles=new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Bus());
        for(Rentable v:vehicles){
            v.rent();
            v.returnVehicle();
            System.out.println();
        }
    }
}