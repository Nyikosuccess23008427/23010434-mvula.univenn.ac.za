import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundPerYear = scanner.nextInt();

        double totalAmount = calculateCompoundInterest(principal, annualRate, years, compoundPerYear);

        System.out.printf("The total amount accumulated after %d years is: $%.2f%n", years, totalAmount);

        scanner.close();
    }

    public static double calculateCompoundInterest(double principal, double annualRate, int years, int compoundPerYear) {
        double ratePerPeriod = annualRate / compoundPerYear;
        int totalCompounds = compoundPerYear * years;
        double amount = principal * Math.pow(1 + ratePerPeriod, totalCompounds);
        return amount;
    }
}