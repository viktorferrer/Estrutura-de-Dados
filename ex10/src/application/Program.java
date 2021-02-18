package application;

import java.util.Locale;
import java.util.Scanner;
import util.Fibonacci;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Digite quantos números deseja saber da sequência de Fibonacci: ");
		int num = sc.nextInt();

		/* mostrando a sequencia até o numero excolhido (num) */

		for (int i = 0; i < num; i++) {
			System.out.println(Fibonacci.seqfibonacci(i));
		}
		
		sc.close();
	}
}
