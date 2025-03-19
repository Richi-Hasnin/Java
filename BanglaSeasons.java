import java.util.Scanner;

public class BanglaSeasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Determine the Bangla season using a switch statement
        String season;
        switch (month) {
            case 3:
            case 4:
                season = "Spring (Boshonto)";
                break;
            case 5:
            case 6:
                season = "Summer (Grishsho)";
                break;
            case 7:
            case 8:
                season = "Rainy (Borsha)";
                break;
            case 9:
            case 10:
                season = "Autumn (Shorot)";
                break;
            case 11:
            case 12:
                season = "Late Autumn (Hemonto)";
                break;
            case 1:
            case 2:
                season = "Winter (Sheet)";
                break;
            default:
                season = "Invalid month! Please enter a number between 1 and 12.";
        }

        // Display the result
        System.out.println("The Bangla season is: " + season);

        scanner.close();
    }
}