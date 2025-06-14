package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class Dummy {

    // Static tax table
    static final double[] SALARY_RANGES = {0, 11600, 47150, 100525, 191950, 243725, 609350};
    static final double[] TAX_RATES = {0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter annual income (-1 to exit): ");
            double salary = scanner.nextDouble();

            if (salary == -1) {
                System.out.println("Exiting program.");
                break;
            }

            double rate = getTaxRate(salary);
            double tax = salary * rate;

            System.out.printf("Annual Income: %.2f Tax rate: %.2f Tax to pay: %.2f\n", salary, rate, tax);
        }

        scanner.close();
    }

    // Static method to get tax rate
    public static double getTaxRate(double salary) {
        for (int i = 0; i < SALARY_RANGES.length - 1; i++) {
            if (salary >= SALARY_RANGES[i] && salary < SALARY_RANGES[i + 1]) {
                return TAX_RATES[i];
            }
        }
        return 0.0;
    }

    public static int dummy() {
        return 0;
    }
}
