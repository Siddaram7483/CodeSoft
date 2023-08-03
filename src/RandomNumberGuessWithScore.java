import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuessWithScore {
        public static void main(String[] args) {
            int min = 1;
            int max = 100;
            int maxAttempts = 5;

            // Create an instance of Random class
            Random random = new Random();

            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);

            boolean playAgain = true;
            int score = 0;

            while (playAgain) {
                int randomNumber = random.nextInt(max - min + 1) + min;
                int attempts = 0;
                boolean guessedCorrectly = false;

                System.out.println("Guess the Random Number between " + min + " and " + max + ":");

                while (attempts < maxAttempts && !guessedCorrectly) {
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
                } else {
                    score++; // Increment the score if the user won the round
                }

                System.out.println("Do you want to play again? (yes/no)");
                String playAgainInput = scanner.next().toLowerCase();
                playAgain = playAgainInput.equals("yes");
            }

            System.out.println("Thanks for playing! Your score is: " + score);
            // Close the scanner
            scanner.close();
        }
    }


