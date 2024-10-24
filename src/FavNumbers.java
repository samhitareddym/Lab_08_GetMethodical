 import java.util.Scanner;
    public class FavNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // Use the getInt method to get the user's favorite integer
            int favInt = SafeInput.getInt(in, "Enter your favorite integer");
            System.out.println("Your favorite integer is: " + favInt);

            // Use the getDouble method to get the user's favorite double
            double favDouble = SafeInput.getDouble(in, "Enter your favorite double");
            System.out.println("Your favorite double is: " + favDouble);
        }
    }

