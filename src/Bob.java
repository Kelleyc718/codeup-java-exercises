import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like to say to Bob?");
        userInput = sc.nextLine();
        char lastChar = userInput.charAt(userInput.length() - 1);

        if (lastChar == '?') {
            System.out.println("Sure");
        } else if (lastChar == '!') {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("Bob")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}