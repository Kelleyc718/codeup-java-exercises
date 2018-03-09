package util;
import java.util.*;

public class Input {
    private Scanner sc;

    public Input () {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        System.out.println("\nEnter a string\n");
        return this.sc.next();
    }

    public boolean yesNo() {
        System.out.println("\nEnter \"yes\" or \"no\"\n");
        String input = this.sc.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max)  {
        System.out.print("\nFor the range of " + min + " and " + max + "\n");
        int userInput = this.getInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        System.out.println("\nEnter an integer\n");
        while(true) {
            try {
                return this.sc.nextInt();
            }
            catch (InputMismatchException e) {
                sc.next();
                System.out.print("\nThat’s not " + "an integer. Try again: \n");
            }
        }
    }



    public double getDouble(double min, double max) {
        System.out.print("\nFor the range of " + min + " and " + max + "\n");
        double userInput = this.getDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        System.out.println("\nEnter a double\n");
        while(true) {
            try {
                return this.sc.nextDouble();
            }
            catch (InputMismatchException e) {
                sc.next();
                System.out.print("That’s not " + "a Double. Try again: ");
            }
        }
    }
}
