import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuess3Until {
        public static void main(String[] args) {
            int min = 1;
            int max = 100;

            // Create an instance of Random class
            Random random = new Random();

            // Generate a random number within the specified range (inclusive)
            int randomNumber = random.nextInt(max - min + 1) + min;

            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);

            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.println("Guess the Random Number between " + min + " and " + max + ":");

                // Read the user's guess
                int userGuess = scanner.nextInt();

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

            // Close the scanner
            scanner.close();
        }
    }


