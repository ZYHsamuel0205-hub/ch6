public class Doubloon {
    public static void main(String[] args) {
        String s = "habihabi";
        System.out.println(isDoubloon(s));
    }

    public static boolean isDoubloon(String s) {
        String low = s.toLowerCase();
        int len = low.length();
        for (int i = 0; i < len; i++) {
            char a = low.charAt(i);
            int count = countLetter(low, a);

            if (count != 2) {
                return false;
            }
        }
        return true;
    }
    public static int countLetter(String s, char a) {
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
