import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please...");
        userInput = sc.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <-- ");
    }
}