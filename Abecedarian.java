public class Abecedarian {
    public static void main(String[] args) {
        System.out.println(isAbecedarian("abcde"));
}
        public static boolean isAbecedarian(String w) {
            int len = w.length();
            for (int i = 0; i < len - 1; i++) {
                if (w.charAt(i + 1) < w.charAt(i)) {
                    return false;
                }
            }
           return true;
        }
    }
