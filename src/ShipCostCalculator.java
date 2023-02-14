import java.util.Scanner;

public class ShipCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfItem = 0;

        // using try and catch blocks to validate the input here.
        while (true) {
            System.out.print("What is the price of the item?: ");

            try {
                priceOfItem = Double.parseDouble(scanner.nextLine());

                if (priceOfItem > 0) {
                    break;
                } else {
                    System.out.println("The number cannot be negative. Please provide a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a number. Please provide a valid number");
            }
        }

        double shippingCost = getShippingCost(priceOfItem);
        double totalPrice = getTotalPrice(priceOfItem, shippingCost);

        System.out.printf("Shipping cost: $%.2f\n", shippingCost);
        System.out.printf("Total Price: $%.2f\n", totalPrice);
    }

    public static double getShippingCost(double priceOfItem) {
        if (priceOfItem >= 100) {
            return 0;
        } else {
            return priceOfItem * 0.02;
        }
    }

    public static double getTotalPrice(double priceOfItem, double shippingCost) {
        return priceOfItem + shippingCost;
    }
}