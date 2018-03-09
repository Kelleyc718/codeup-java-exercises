package util;

public class inputTest {
    public static void main(String[] args) {
        Input myTest = new Input();
        System.out.println(myTest.getString());
        System.out.println(myTest.yesNo());
        System.out.println(myTest.getInt());
        System.out.println(myTest.getInt(1, 100));
        System.out.println(myTest.getDouble());
        System.out.println(myTest.getDouble(1.0, 99.99));
    }
}
