public class gauss {

	public static void main (String[] args) {
	System.out.println (gauss (1.0, 1000));
	System.out.print (Math.exp(-1.0 * 1.0));
	}

	public static double gauss (double x, int n) {
		double sum = 0.0;
		double term = 1.0;
		
		//term 1 here = 1
		//term 2 = -x^2
		
		for (int i = 1; i <= n; i++) {
		sum = sum + term;
		term = term * (-(x * x) / i);
		}
		return sum;
	}
}
