package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input () {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return this.sc.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.sc.next();
    }

    public boolean yesNo() {
        System.out.println("Enter \"yes\" or \"no\"");
        String input = this.sc.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a integer between " + min + " and " + max + ".");
        int userInput = this.getInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        return this.sc.nextInt();
    }
    public int getInt(String prompt) {
        System.out.println("Enter a number");
        return this.sc.nextInt();
    }


    public double getDouble(double min, double max) {
        System.out.println("Enter a number between" + min + " and " + max);
        double userInput = this.getDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        return this.sc.nextDouble();
    }
    public double getDouble(String prompt) {
        System.out.println("Enter a number (decimals are ok)");
        return this.sc.nextDouble();
    }
}
