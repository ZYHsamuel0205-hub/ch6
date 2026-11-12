
public class PPAP {

    public static void main(String[] args) {
        System.out.println(ppap("I have a brain, I have a zombie"));
    }

    public static String ppap(String str) {
        int indexOfComma = str.indexOf(", ");

        String object1 = str.substring(9, indexOfComma);
        String object2 = str.substring(indexOfComma + 11, str.length());

        //capitalizing the first letter
        object2 = object2.substring(0, 1).toUpperCase() + object2.substring(1);

        return "Uh! " + object2 + " " + object1 + ".";
    }
}
