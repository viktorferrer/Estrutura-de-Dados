package application;

import java.util.Locale;
import java.util.Scanner;
import util.SerieN;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de N: ");
		int num = sc.nextInt();

		System.out.print("O resultado da série de " + num + " números é " + SerieN.serie(num));

		sc.close();
	}
}
