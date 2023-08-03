import java.util.Random;
public class RandomNumber {
        public static void main(String[] args) {
            int min = 1;
            int max = 100;

            // Create an instance of Random class
            Random random = new Random();

            // Generate a random number within the specified range (inclusive)
            int randomNumber = random.nextInt(max - min + 1) + min;

            System.out.println("Random Number between " + min + " and " + max + ": " + randomNumber);
        }
    }


