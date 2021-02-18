package util;

public class Soma {

	public static int somar(int num) {

		if (num == 0) {
			return 0;

		} else {
			return somar(num - 1) + num;
		}
	}
}
