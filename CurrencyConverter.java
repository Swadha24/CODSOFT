import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        double usdRate = 0.012; // 1 INR = 0.012 USD
        double eurRate = 0.011; // 1 INR = 0.011 EUR
        double gbpRate = 0.0095; // 1 INR = 0.0095 GBP

        System.out.println(" Welcome to Currency Converter!");
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        System.out.println("Choose the currency to convert into:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        double convertedAmount = 0;
        String currencySymbol = "";

        switch (choice) {
            case 1:
                convertedAmount = inr * usdRate;
                currencySymbol = "$";
                break;
            case 2:
                convertedAmount = inr * eurRate;
                currencySymbol = "€";
                break;
            case 3:
                convertedAmount = inr * gbpRate;
                currencySymbol = "£";
                break;
            default:
                System.out.println(" Invalid choice!");
                sc.close();
                return;
        }

        System.out.printf(" Rs.%.2f = %s%.2f\n", inr, currencySymbol, convertedAmount);
        sc.close();
    }
}
