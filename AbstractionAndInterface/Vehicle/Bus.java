package AbstractionAndInterface.Vehicle;
public class Bus implements Rentable{
    public void rent(){
        System.out.println("Bus rented");
    }
    public void returnVehicle(){
        System.out.println("Bus returned");
    }
}