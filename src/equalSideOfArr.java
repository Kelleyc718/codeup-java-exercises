import java.util.ArrayList;

public class equalSideOfArr {
    public static void main(String[] args) {
        findEvenIndex(new int[] {1,2,3,4,3,2,1});
    }
    public static void findEvenIndex(int[] arr) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int arrEnd = arr[arr.length - 1 - i];
            if (arr[i] == arrEnd) {
                num.add(arrEnd);
                System.out.println(num);
            }
        }
    }
}
