import java.util.Scanner;

public class OddSquaresSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        int oddNumber = 1;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += oddNumber * oddNumber; // Add the square of the current odd number
            oddNumber += 2; // Move to the next odd number
        }

        // Display the result
        System.out.println("The sum of the series up to " + n + " terms is: " + sum);

        scanner.close();
    }
}
