package util;


public class inputTest {
    public static void main(String[] args) {
        //System.out.printf("%s", FileHelper.slurp("src/Person.java"));
        FileHelper.spit("text4.txt", FileHelper.slurp("src/util/input.java"), true);
    }
}
