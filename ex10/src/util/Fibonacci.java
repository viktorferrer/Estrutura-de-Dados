package util;

public class Fibonacci {

	public static int seqfibonacci(int num) {

		if (num < 2) {
			return 1;
		}
		
		/* formula de fib */
		return seqfibonacci(num - 1) + seqfibonacci(num - 2);
	}
}
