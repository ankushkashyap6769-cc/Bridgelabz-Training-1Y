package AbstractionAndInterface.UnitConversionTool;
public class Runner {
    public static void main(String[] args) {
        double km = 10;
        double miles = 5;
        double kg = 70;
        double lbs = 150;
        System.out.println("---------Unit Conversion------------");
        System.out.println(km + " km = " + Converter.kmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + Converter.milesToKm(miles) + " km");
        System.out.println(kg + " kg = " + Converter.kgToLbs(kg) + " lbs");
        System.out.println(lbs + " lbs = " + Converter.lbsToKg(lbs) + " kg");
    }
}