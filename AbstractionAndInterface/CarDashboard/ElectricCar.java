package AbstractionAndInterface.CarDashboard;
public class ElectricCar implements Vehicle{
    private int batteryPercentage;
    public ElectricCar(int batteryPercentage){
        this.batteryPercentage=batteryPercentage;
    }
    public void displaySpeed(){
        System.out.println("Electric Car Speed: 60 km/h");
    }
    public void displayBattery(){
        System.out.println("Battery: "+batteryPercentage+"%");
    }
}