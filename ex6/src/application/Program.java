package application;

import java.util.Locale;
import java.util.Scanner;
import util.Fatorial;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Digite o número para calcular o seu fatorial");
		int num = sc.nextInt();

		System.out.println(
				"O fatorial de " + num + " é " + Fatorial.fatorial(num));
		sc.close();
	}
}
