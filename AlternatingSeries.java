public class AlternatingSeries {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract even terms
            } else {
                sum += i; // Add odd terms
            }
        }

        // Display the result
        System.out.println("The sum of the series up to " + n + " terms is: " + sum);

        scanner.close();
    }
}
