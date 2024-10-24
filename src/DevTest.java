import java.util.Scanner;
    public class DevTest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            //Test getNonZeroLenString
            String name = SafeInput.getNonZeroLenString(in, "Enter your name");
            System.out.println("You entered: " + name);

             //Test getInt
            int favNum = SafeInput.getInt(in, "Enter your favourite number");
            System.out.println("You entered: " + favNum);

            //Test getDouble
            double validDouble = SafeInput.getDouble(in, "Enter the value of pi");
            System.out.println ("You entered: " + validDouble);

            //Test getRangedInt
            int score = SafeInput.getRangedInt (in, "Enter your score", 50, 100);
            System.out.println("You entered score: " + score);

            //Test getRangedDouble
            double height = SafeInput.getRangedDouble(in, "Enter your height in meters", 1.5, 2.5);
            System.out.println("You entered height: " + height);

           // Test getYNConfirm
            boolean continueGame = SafeInput.getYNConfirm (in, "Do you want to continue?(Y/N)");
            if (continueGame) {
                System.out.println("You chose to continue.");
            } else {
                System.out.println("You chose to stop.");
            }
            //Test getRegExString
            String phoneNumber = SafeInput.getRegExString(in, "Enter your phone number (10 digits)", "^\\d{10}$");
            System.out.println("Your phone number is: " + phoneNumber);
        }
    }

