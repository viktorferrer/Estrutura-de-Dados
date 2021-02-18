package util;

public class Balance {

	public static double[] vect = new double[100];
	public static int i;

	public static void random_value() {

		/* recebe valores */

		for (int i = 0; i < vect.length; i++) {
			vect[i] = (int) (((Math.random() * 2000) - 1000));
		}
	}

	/* calculando e mostrando os resultados */

	public static void balance() {

		double sum_positive = 0, sum_negative = 0, sum = 0, positive_average = 0, average = 0;

		int aux = 1;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] >= 100 && vect[i] <= 1000) {

				sum_positive += vect[i];
				aux += 1;

			} else if (vect[i] < 0) {
				sum_negative += vect[i];
			}

			sum += vect[i];
		}

		average = sum / vect.length;
		positive_average = sum_positive / aux;

		System.out.printf(
				"\nA média dos saldos recebidos de 100 a 1000 é: %.2f\n", positive_average);
		
		System.out.printf(
				"A média geral de todos os saldos: %.2f\n ",  average);
		
		System.out.printf(
				"A soma apenas dos saldos negativos: %.2f\n ", sum_negative);
	}
}
