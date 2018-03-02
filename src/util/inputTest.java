package util;
import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Input myTest = new Input();
        System.out.println(myTest.getString("Get string"));
        System.out.println(myTest.yesNo());
        System.out.println(myTest.getInt());
        System.out.println(myTest.getInt(1, 10));
        System.out.println(myTest.getDouble(0.3, 9.6));
    }
}
