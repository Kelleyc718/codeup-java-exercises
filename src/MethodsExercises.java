import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        int a = getInteger(1, 10);
        int b = getInteger(1, 10);

        System.out.println("Add: " + add(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
        System.out.println("Modulus: " + modulus(a, b));
        System.out.println(" = " + factorial(a));
        System.out.println(diceRoll(a, b));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println("Enter a number between " + a + " and " + b + ".");
        userInput = sc.nextInt();

        if (userInput < a || userInput > b) {
            System.out.println("Please enter a valid number within the range of " + a + " and " + b + ".");
            userInput = sc.nextInt();
        }
        return userInput;
    }

    public static long factorial(int a) {
        int total = 0;
        System.out.print(a + "! = ");
        for (int i = 1; i <= a; i++) {
            if (i == a) {
                System.out.print(i);
            } else {
                System.out.print(i + " x ");
                total += (i * (i + 1));
            }
        }
        return total;
    }

    public static String diceRoll(int a, int b) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You have been given two dice...");

        String input;
        System.out.println("Your dice have " + a + " and " + b + " sides.");
        System.out.println("Type \"Roll\" to roll your dice...");
        input = sc.next();

        while (!input.equals("Roll")) {
            System.out.println("TRY AGAIN!");
            System.out.println("Type \" Roll \" to roll your dice...");
            input = sc.next();
        }
        int resultOne = randomNum(a);
        int resultTwo = randomNum(b);
        System.out.println("You rolled a " + resultOne + " and " + resultTwo + '.');

        System.out.println("Would you like to roll again?");
        input = sc.next();

        while (input.equalsIgnoreCase("y")) {
            resultOne = randomNum(a);
            resultTwo = randomNum(b);
            System.out.println("You rolled a " + resultOne + " and " + resultTwo + '.');

            System.out.println("Would you like to roll again?");
            input = sc.next();
        }

        return "Have a nice day";
    }

    public static int randomNum(int num) {
        Random rand = new Random();
        int result = rand.nextInt(num - 1) + 1;
        return result;
    }

}
