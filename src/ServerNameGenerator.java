public class ServerNameGenerator {
    public static void main(String[] args) {
        String [] adjs = {"happy", "sad", "mad", "chubby", "skinny", "jolly", "ugly", "pretty", "short", "tall"};
        String [] nouns = {"dog", "cat", "mouse", "bird", "goat", "camel", "antelope",      "frog", "duck", "horse"};
        System.out.println(nameGenerator(adjs, nouns));
    }

    public static String nameGenerator (String adjs[], String nouns[]) {
        int randomNum = (int) (Math.random() * 10);
        String nameGen = adjs[randomNum] + "-" + nouns[randomNum];
        return nameGen;
    }
}
