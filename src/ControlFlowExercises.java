public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;
        do {
            i *= i;
            System.out.println(i);
        } while (i <= 10000);
    }
}
