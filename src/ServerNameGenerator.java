import java.util.Random;

public class ServerNameGenerator {
    public static Random rng = new Random();

    public static final String [] adjs = {"happy", "sad", "mad", "chubby", "skinny", "jolly", "ugly", "pretty", "short", "tall"};

    public static final String [] nouns = {"dog", "cat", "mouse", "bird", "goat", "camel", "antelope", "frog", "duck", "horse"};

    public static void main(String[] args) {
        System.out.println(nameGenerator(adjs, nouns));
    }
    public static int randomNum(String[] coll) {
        int randomNum = rng.nextInt(coll.length);
        return randomNum;
    }

    public static String nameGenerator (String adjs[], String nouns[]) {
        String nameGen = adjs[randomNum(adjs)] + "-" + nouns[randomNum(nouns)];
        return nameGen;
    }
}
