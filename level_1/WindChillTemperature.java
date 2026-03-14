package com.gla.methods.level_1;
import java.util.*;
public class WindChillTemperature {
    public double calculate_wind_chill(double temp, double windspeed){
        return (35.74 + 0.6215 * temp + (0.4275*temp-35.75) * Math.pow( windspeed, 0.16));
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WindChillTemperature find = new WindChillTemperature();
        System.out.print("Enter Tempertature: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter Wind Speed: ");
        double widn_speed = sc.nextDouble();
        System.out.println("Answer: " + find.calculate_wind_chill(temperature,widn_speed));
    }
}
