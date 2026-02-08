import java.util.Scanner;
public class ArrayFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long temp = num;
        int count = 0;
        if (temp == 0)
            count = 1;
        else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }
        int[] digits = new int[count];
        int index = 0;
        temp = num;
        if (temp == 0) {
            digits[index] = 0;
        } else {
            while (temp > 0) {
                digits[index++] = (int)(temp % 10);
                temp /= 10;
            }
        }
        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}
