public class Binary {

    public static void main(String[] args) {
		System.out.println(convertToBinary(13));
    }

	public static String convertToBinary(int num) {
		String result = "";

		while (num > 0) {
			int remainder = num % 2;
			result = remainder + result;
			num = num /2;
		}
		return result;
	}
}
