public class Des {
    static int test_counter = 0;
    static int[] test_values = {2, 2, 7, 9, 3, 4, 7, 12};
    static boolean TEST = true;
    public static int lancerDes() {
        return TEST ? test_values[(test_counter++)%test_values.length] : (lancerDe() + lancerDe());
    }

    public static int lancerDe() {
        return (int) Math.floor(Math.random() * 6);
    }
}
