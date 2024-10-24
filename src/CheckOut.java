import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            // Get item price (.50 to $10.00)
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of your item", 0.50, 10.00);
            totalCost += itemPrice;

            // Check if user has more items
            moreItems = SafeInput.getYNConfirm(scanner, "Do you have more items to check out?");
        } while (moreItems);

        // Display the total cost
        System.out.printf("Total cost of items: $%.2f%n", totalCost);
    }
}
