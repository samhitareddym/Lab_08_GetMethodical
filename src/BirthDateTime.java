import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year (1950-2015)
        int year = SafeInput.getRangedInt(scanner, "Enter your birth year", 1950, 2015);

        // Get month (1-12)
        int month = SafeInput.getRangedInt(scanner, "Enter your birth month", 1, 12);

        // Get day based on month and year
        int day = 0;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                day = SafeInput.getRangedInt(scanner, "Enter your birth day", 1, 31);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                day = SafeInput.getRangedInt(scanner, "Enter your birth day", 1, 30);
                break;
            case 2: // February
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = SafeInput.getRangedInt(scanner, "Enter your birth day", 1, 29);
                } else {
                    day = SafeInput.getRangedInt(scanner, "Enter your birth day", 1, 28);
                }
                break;
        }
        // Get hours (1-24)
        int hours = SafeInput.getRangedInt(scanner, "Enter your birth hour", 1, 24);

        // Get minutes (0-59)
        int minutes = SafeInput.getRangedInt(scanner, "Enter your birth minutes", 0, 59);

        // Display the birthdate and time
        System.out.println("You were born on: " + month + "-" + day + "-" + year + " " + hours + ":" + minutes);

    }
}

