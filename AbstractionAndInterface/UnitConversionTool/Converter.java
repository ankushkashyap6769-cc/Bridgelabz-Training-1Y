package AbstractionAndInterface.UnitConversionTool;
interface Converter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    static double milesToKm(double miles) {
        return miles / 0.621371;
    }
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}