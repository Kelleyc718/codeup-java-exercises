import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println("Welcome to High/Low!");
        System.out.println("The program has picked a random number...take a guess at what it is...");
        guess();
    }

    private static int randomNum() {
        Random rand = new Random();
        int result = rand.nextInt(100 - 1) + 1;
        return result;
    }

    private static int guess() {
        Scanner sc = new Scanner(System.in);
        int result = randomNum();
        int userInput;
        int userGuess = 0;

        do {
            if (userGuess == 10) {
                System.out.println("You've exceeded the number of " + "guesses.");
                break;
            }
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                if (userInput == result) {
                    System.out.println("Congratulations! You guessed it right!");
                } else if (userInput > result) {
                    System.out.println("Lower...");
                } else if (userInput < result) {
                    System.out.println("Higher...");
                }
                userGuess += 1;
            } else {
                break;
            }
        } while (userInput != result);
        System.out.println("Thanks for playing!");
        return randomNum();
    }
}
