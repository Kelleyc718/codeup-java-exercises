package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        System.out.println("Super's method called");
        return length * width;
    }

    public int getPerimeter() {
        System.out.println("Super's method called");
        return (2 * length) + (2 * width);
    }
}
