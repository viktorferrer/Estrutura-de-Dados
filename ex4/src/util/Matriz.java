package util;

public class Matriz {

	public static void matriz() {

		int[][] mat = new int[4][4];

		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat.length; n++) {
				mat[m][n] = (int) ((Math.random() * 99) + 1);
			}
		}

		int soma = 0;

		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat.length; n++) {
				soma += mat[m][n];
			}
		}

		System.out.println(
				"A soma dos valores nos intervalos de 1 a 100: " + soma);

		int numImpar = 0;

		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat.length; n++) {
				if (mat[m][n] >= 30 && mat[m][n] <= 50) {
					if (mat[m][n] % 2 != 0) {
						numImpar++;
					}
				}
			}
		}

		System.out.println(
				"A quantidade dos números ímpares entre 30 e 50: " + numImpar);

		int divBy8 = 0;

		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat.length; n++) {
				if (mat[m][n] % 8 == 0) {
					divBy8++;
				}
			}
		}

		System.out.println(
				"Quantidade de números divisíveis por 8: " + divBy8);

		int divBy3 = 0;

		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat.length; n++) {
				if (mat[m][n] % 2 != 0 && mat[m][n] % 3 != 0) {
					divBy3 += 1;
				}
			}
		}

		System.out.println(
				"Quantidade de números ímpares divisíveis por 3: " + divBy3);

		double maiorvalor = 0;

		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat.length; n++) {
				if (mat[m][n] > maiorvalor) {
					maiorvalor = mat[m][n];
				}
			}
		}

		double fat = maiorvalor;

		for (int i = (int) maiorvalor; i > 1; i--) {
			fat *= (i - 1);
		}

		System.out.println(
				"O fatorial do maior número da matriz é: " + fat);
	}
}
