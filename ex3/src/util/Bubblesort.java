package util;

public class Bubblesort {

	public static int[] vect = new int[100];

	/*receber e mostrar os valores desordenados*/

	public static void random_value() {
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = (int) (((Math.random() * 200) - 100));
			System.out.print("Conteúdo do vetor de forma desordenada : " + vect[i] + " \n");
		}
	}

	/* bubblesort - ordenando valores dados por math.random */

	public static void bubblesort() {

		int aux;

		for (int i = 0; i < vect.length; i++) {
			for (int j = i + 1; j < vect.length; j++) {
				if (vect[i] > vect[j]) {
					aux = vect[j];
					vect[j] = vect[i];
					vect[i] = aux;
				}
			}
		}

		/* exibindo a ordem */

		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Conteúdo do vetor de forma ordenada :" + vect[i] + " \n");
		}
	}
}
