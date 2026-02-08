import java.util.Scanner;

class ArrayBonusDiscount{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] serviceYears = new double[10];
        double[] bonuses = new double[10];
        double[] updatedSalaries = new double[10];

        double totalBonusPaid = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int employee = 0; employee < 10; employee++) {
            System.out.println("Enter details for Employee " + (employee + 1));

            System.out.print("Salary: ");
            salaries[employee] = input.nextDouble();

            System.out.print("Years of Service: ");
            serviceYears[employee] = input.nextDouble();

            if (salaries[employee] <= 0 || serviceYears[employee] < 0) {
                System.out.println("Invalid input. Please re-enter the details.");
                employee--;
            }
        }

        for (int employee = 0; employee < 10; employee++) {

            if (serviceYears[employee] > 5) {
                bonuses[employee] = salaries[employee] * 0.05;
            } else {
                bonuses[employee] = salaries[employee] * 0.02;
            }

            updatedSalaries[employee] = salaries[employee] + bonuses[employee];

            totalBonusPaid += bonuses[employee];
            totalOldSalary += salaries[employee];
            totalNewSalary += updatedSalaries[employee];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonusPaid);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
