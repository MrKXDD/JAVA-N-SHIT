package Lab8_2;
import java.util.Scanner;

public class YearCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter first day of year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
        int firstDay = input.nextInt();

        // Month names
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Days in months
        int[] daysInMonth = {
            31, // January
            isLeapYear(year) ? 29 : 28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
        };

        // Print calendar month by month
        for (int month = 0; month < 12; month++) {
            // Print header
            System.out.printf("\n\n\t\t%s %d\n", months[month], year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print leading spaces
            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }

            // Print days of the month
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%3d ", day);

                // New line at the end of the week
                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }

            // Set the first day for the next month
            firstDay = (firstDay + daysInMonth[month]) % 7;
            System.out.println();
        }

        input.close();
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
