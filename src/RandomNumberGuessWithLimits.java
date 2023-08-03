import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuessWithLimits {
        public static void main(String[] args) {
            int min = 1;
            int max = 100;
            int maxAttempts = 5; // Set the maximum number of attempts here

            // Create an instance of Random class
            Random random = new Random();

            // Generate a random number within the specified range (inclusive)
            int randomNumber = random.nextInt(max - min + 1) + min;

            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);

            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.println("Guess the Random Number between " + min + " and " + max + ":");
                int userGuess = scanner.nextInt();
                attempts++;

                // Check if the user's guess matches the generated random number
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Oops! Your guess is too low.");
                } else {
                    System.out.println("Oops! Your guess is too high.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum number of attempts.");
                System.out.println("The correct number was: " + randomNumber);
            }

            // Close the scanner
            scanner.close();
        }
    }


