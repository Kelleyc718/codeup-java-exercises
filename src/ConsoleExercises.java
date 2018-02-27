import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String length;
        String width;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the class room");
        length = sc.nextLine();

        System.out.println("Enter the width of the class room");
        width = sc.nextLine();

        int perimeter = (int) (2 * Double.parseDouble(length)) + (int) (2 * Double
                .parseDouble(width));
        int area = Float.valueOf(length).intValue() * Float.valueOf(width).intValue();
        int volume = area * 9;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Volume: " + volume);
    }
}