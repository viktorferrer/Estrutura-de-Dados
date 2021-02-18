package application;

import java.util.Locale;
import util.SomaImp;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		System.out.println(
				"A soma dos números ímpares de 1 a 300 é: " + SomaImp.somar(300));
	}

}
