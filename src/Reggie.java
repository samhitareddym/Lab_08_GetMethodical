import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Social Security Number (SSN)
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN entered: " + ssn);

        // Get UC Student M number
        String ucStudentMNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (format: Mxxxxx)", "^(M|m)\\d{5}$");
        System.out.println("Valid UC Student M number entered: " + ucStudentMNumber);

        // Get menu choice
        String menuChoice = SafeInput.getRegExString(scanner, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Valid menu choice entered: " + menuChoice);
    }
}

