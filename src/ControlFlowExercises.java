import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
            String userInput;
            String contInput = "";
            Character mod;

            Scanner sc = new Scanner(System.in);
            do {
                int usrNum;
                System.out.println("Please enter your score");
                userInput = sc.nextLine();
                usrNum = Integer.parseInt(userInput);

                if (usrNum >= 90) {
                        System.out.print("A");
                } else if (usrNum >= 80) {
                    System.out.print("B");
                } else if (usrNum >= 70) {
                    System.out.print("C");
                } else if (usrNum >= 60) {
                    System.out.print("D");
                } else {
                    System.out.print("F");
                }

                if (usrNum % 10 >= 7) {
                    mod = '+';
                    System.out.println(mod);
                } else if (usrNum % 10 <= 3) {
                    mod = '-';
                    System.out.println(mod);
                } else {
                    System.out.println();
                }


                System.out.println("Do you have another score to enter (y/n)?");
                userInput = sc.nextLine();
            } while(userInput.equals("y"));
    }
}