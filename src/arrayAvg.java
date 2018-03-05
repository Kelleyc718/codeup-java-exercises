public class arrayAvg {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i : classPoints) {
            sum += i;
        }
        int classTotal = sum + yourPoints;
        int avg = classTotal / (classPoints.length + 1);
        return (yourPoints > avg);
    }
}
