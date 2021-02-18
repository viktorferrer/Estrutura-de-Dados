package application;

import java.util.Locale;
import util.Soma;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println(Soma.somar(100));
	}
}