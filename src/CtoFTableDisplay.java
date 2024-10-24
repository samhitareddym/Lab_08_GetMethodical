public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Print table header
        System.out.println("Celsius   Fahrenheit");
        System.out.println("-----------------------");
        // Loop through Celsius values from -100 to 100
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = SafeInput.CtoF(celsius); // Convert Celsius to Fahrenheit using SafeInput
            // Print the Celsius and Fahrenheit values
            System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);;
        }
    }
}

