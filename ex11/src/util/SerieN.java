package util;

public class SerieN {

	public static double serie(double num) {
		
		if (num == 0) {
			return 0;

		} else {
			return 1 / num + serie(num - 1);
		}
	}
}
