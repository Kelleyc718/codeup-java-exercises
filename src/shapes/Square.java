package shapes;

public class Square extends Rectangle {
    private int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("Sub method called");
        return side * 4;
    }

    @Override
    public int getArea() {
        System.out.println("Sub method called");
        return (int) Math.pow(side, 2);
    }


}
