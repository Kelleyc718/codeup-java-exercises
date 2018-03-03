package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input newInput = new Input();
        System.out.println("Want to create a circle?");
        boolean cont = newInput.yesNo();
        if (cont) {

            do {
                double radius = newInput.getDouble();
                Circle newCircle = new Circle(radius);

                System.out.println(newCircle.getArea());
                System.out.println(newCircle.getCircumference());
                System.out.println("Create another circle?");
                cont = newInput.yesNo();
            } while (cont);

        }
        System.out.println("Have a good day.");
    }
}
