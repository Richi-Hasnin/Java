import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        // Prompt the user to enter the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}
