import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utils {

    static boolean isInteger(String val) {
        return val.matches("-?[0-9]+");
    }

    static double getRandomPrice() {
        Random rnd = new Random();
        return rnd.nextInt(100, 999);
    }

    //  CODE CHALLENGE 24.1
    static int getUserIntInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
            try {
                userInput = scanner.nextLine();
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Please input a number...");
            }

        }
    }


}