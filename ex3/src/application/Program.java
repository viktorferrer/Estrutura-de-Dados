package application;

import java.util.Locale;
import util.Bubblesort;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Bubblesort.random_value();
		Bubblesort.bubblesort();
	}
}