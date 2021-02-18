package application;

import java.util.Locale;
import util.SomaPares;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println(
				"A soma dos números pares de 1 a 200 é: " + SomaPares.somar(200));
	}
}
