import java.util.Random;
import java.util.Scanner;

public class Number_Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randgen = new Random();

        int upperBound = 100;
        int lowerBound = 1;
        int maxattempts = 10;
        int score = 0;

        boolean playagain = true;

        while (playagain) {
            int targetNumber = randgen.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Thinking the no of a number between " + lowerBound + " and " + upperBound + ".");

            while (attempts < maxattempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                sc.nextLine();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxattempts - attempts + 1;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts == maxattempts) {
                    System.out.println(
                            "You have reached the maximum number of attempts. The number was: " + targetNumber);
                }
            }

            System.out.println("Your current score is: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.nextLine();
            playagain = playAgainResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");

    }
}
