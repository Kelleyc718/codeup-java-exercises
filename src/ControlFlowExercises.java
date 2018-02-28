import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
            String userInput;

            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("What number would you like to go up to?");
                userInput = sc.nextLine();
                int usrNum = Integer.parseInt(userInput);

                System.out.println("Here is your table!");
                System.out.println("number |  squared   | cubed");
                System.out.println("------ |  -------   | -----");

                for (int i = 1; i <= usrNum; i++) {
                    int squared = (int) Math.pow(i, 2);
                    int cubed = (int) Math.pow(i, 3);

                    System.out.print(i);
                    if (i >= 10) {
                        System.out.printf("%7s", "| ");
                    } else {
                        System.out.printf("%8s", "| ");
                    }

                    System.out.print(squared);
                    if (squared >= 10) {
                        System.out.printf("%11s", "| ");
                    } else {
                        System.out.printf("%12s", "| ");
                    }
                    System.out.print(cubed);
                    System.out.print("\n");
                }
                System.out.println("Would you like to continue (y/n)?");
                userInput = sc.nextLine();
            } while(userInput.equals("y"));
    }
}