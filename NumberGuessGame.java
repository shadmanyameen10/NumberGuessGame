import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        
        System.out.println("Welcome to Number Guess Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low. Try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
