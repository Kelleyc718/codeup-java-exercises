package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input () {
        this.sc = new Scanner(System.in);
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
        System.out.println("get int test");
        return this.sc.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("double min/max test");
        double userInput = this.getDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        System.out.println("double test");
        return this.sc.nextDouble();
    }
}
