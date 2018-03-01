import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        int a = getInteger(1, 10);
        int b = getInteger(a, 10);

        System.out.println("Add: " + add(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
        System.out.println("Modulus: " + modulus(a, b));
        System.out.println(" = " + factorial(a));
        diceRoll(a, b);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + a + " and " + b + ".");
        int userInput = sc.nextInt();
        if (userInput < a || userInput > b) {
            System.out.println("Please enter a valid number within the range of " + a + " and " + b + ".");
            getInteger(a, b);
        }
        return userInput;
    }

    public static long factorial(int num) {
        long total = 1;
        System.out.print(num + "! = ");
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(i);
            } else {
                System.out.print(i + " x ");
                total += total * (i + 1);
            }
        }
        return total;
    }

    public static void diceRoll(int a, int b) {
        int resultOne = randomNum(a);
        int resultTwo = randomNum(b);
        System.out.println("You rolled a " + resultOne + " and " + resultTwo + '.');
            if (cont()) {
                diceRoll(a, b);
            }
    }

    public static boolean cont() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to roll again?");
        String input = sc.next();
        return (input.equalsIgnoreCase("y"));
    }

    public static int randomNum(int num) {
        Random rand = new Random();
        int result = rand.nextInt(num - 1) + 1;
        return result;
    }

}
