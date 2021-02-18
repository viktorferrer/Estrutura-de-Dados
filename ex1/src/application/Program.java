package application;

import java.util.Locale;
import util.Balance;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Balance.random_value();
		Balance.balance();
	}
}
