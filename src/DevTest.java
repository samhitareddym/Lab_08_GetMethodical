import java.util.Scanner;

    public class DevTest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String name = SafeInput.getNonZeroLenString(in, "Enter your name");
            System.out.println("You entered: " + name);
        }
    }

