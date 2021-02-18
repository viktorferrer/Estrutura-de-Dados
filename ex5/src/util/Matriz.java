package util;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void matriz() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[4][4];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i == 0 && j == 0) {
					mat[i][j] = 1;

				} else if (i == 1 && j == 1) {
					mat[i][j] = 3;

				} else if (i == 2 && j == 2) {
					mat[i][j] = 9;

				} else if (i == 3 && j == 3) {
					mat[i][j] = 27;

				} else {
					System.out.println(
							"Digite um número para a posição [" + i + "][" + j + "]" + " da matriz");
					mat[i][j] = sc.nextInt();
				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
			sc.close();
		}
	}
}
