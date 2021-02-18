package util;

public class Fatorial {

	public static int fatorial(int num) {

		// após empilhar e num=0, retorna o valor de seu fatorial, que no caso, é 1

		if (num == 0) {
			return 1;
		}

		// retorna a função fatorial do número inserido
	
		return num * fatorial(num - 1);
	}
}