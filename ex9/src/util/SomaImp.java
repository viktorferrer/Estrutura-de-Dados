package util;

public class SomaImp {

	public static int somar(int num) {

		if (num == 0) {
			return 0;

		} else if (num % 2 != 0) {
			return somar(num - 1) + num;

		} else {
			return somar(num - 1);
		}
	}
}
