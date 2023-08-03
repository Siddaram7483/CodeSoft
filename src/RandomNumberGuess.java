import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuess {
        public static void main(String[] args) {
            int min = 1;
            int max = 100;

            // Create an instance of Random class
            Random random = new Random();

            // Generate a random number within the specified range (inclusive)
            int randomNumber = random.nextInt(max - min + 1) + min;

            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);

            System.out.println("Guess the Random Number between " + min + " and " + max + ":");

            // Read the user's guess
            int userGuess = scanner.nextInt();

            // Check if the user's guess matches the generated random number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
            } else {
                System.out.println("Oops! Your guess is incorrect. The correct number was: " + randomNumber);
            }

            // Close the scanner
            scanner.close();
        }
    }


