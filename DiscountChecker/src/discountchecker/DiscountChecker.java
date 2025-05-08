package discountchecker;

import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Ask if user is a member
        System.out.print("Are you a member? (yes/no): ");
        input.nextLine(); // Consume the newline
        String isMemberInput = input.nextLine();
        boolean isMember = isMemberInput.equalsIgnoreCase("yes");

        // Check eligibility using OR operator
        if (age >= 60 || isMember) {
            System.out.println("You are eligible for a discount!");
        } else {
            System.out.println("You are not eligible for a discount.");
        }

        input.close();
    }
}
