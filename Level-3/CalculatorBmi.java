import java.util.Scanner;

public class CalculatorBmi{

    public static String[][] calculateBMI(int[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] result) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-15s\n","Person","Height(cm)","Weight(kg)","BMI","Status");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-8d %-10s %-10s %-10s %-15s\n",
                    i + 1,
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            data[i][0] = sc.nextInt();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            data[i][1] = sc.nextInt();
        }
        String[][] result = calculateBMI(data);
        display(result);
        sc.close();
    }
}
