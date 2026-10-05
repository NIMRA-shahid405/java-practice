import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many items are you buying?");
        int count = input.nextInt();
        
        double[] prices = new double[count];
        int[] quantities = new int[count];
        double grandTotal = 0;
        
        for (int i = 0; i < count; i++) {
            System.out.println("Enter price of item " + (i + 1) + ":");
            prices[i] = input.nextDouble();
            
            System.out.println("Enter quantity of item " + (i + 1) + ":");
            quantities[i] = input.nextInt();
            
            double itemTotal = prices[i] * quantities[i];
            grandTotal = grandTotal + itemTotal;
            
            System.out.println("Subtotal for item " + (i + 1) + ": " + itemTotal);
        }
        
        System.out.println("Grand Total: " + grandTotal);
    }
}