public class squareRoot {
	
	public static void main (String[] args) {
	squareRoot (81.0);
		System.out.print (squareRoot (81.0));
	}
	
	public static double squareRoot (double a) {
		double x;
		for (x = a / 2; (x - (x + a/x) / 2) >= 0.0001; x = (x + a / x) / 2){
		}
		return x;
	}
}
