import java.util.Scanner;

public class FoodOrderCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prices of food items
        int[] prices = {200, 100, 150, 250, 200};

        System.out.println("Food items:");
        System.out.println("1. Pizza - Rs.200");
        System.out.println("2. Burger - Rs.100");
        System.out.println("3. Dosa - Rs.150");
        System.out.println("4. Biryani - Rs.250");
        System.out.println("5. Chicken Rice - Rs.200");

       
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total cost before discount
        int costBeforeDiscount = prices[choice - 1] * quantity;

        // Apply discount if total exceeds Rs.500
        double discount = 0;
        if (costBeforeDiscount > 500) {
            discount = costBeforeDiscount * 0.10;
        }

        // Calculate final cost after discount
        double finalCost = costBeforeDiscount - discount;

        // Display results
        System.out.println("Total cost before discount: Rs. " + costBeforeDiscount);
        System.out.println("Discount applied: Rs. " + (int)discount);
        System.out.println("Total cost after discount: Rs. " + (int)finalCost);

        scanner.close();
    }
}
