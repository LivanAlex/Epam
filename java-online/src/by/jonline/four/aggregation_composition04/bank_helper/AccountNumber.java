package by.jonline.four.aggregation_composition04.bank_helper;

import java.util.HashSet;
import java.util.Random;

public abstract class AccountNumber {
	
	private static HashSet<Integer> number;
	
	public static int number() {
		if(number == null) {
			number = new HashSet<Integer>();
		}
		
		int random;
		Random ran = new Random();
		
		do {
			random = ran.nextInt(9999);
		} while(number.contains(random));
		
		number.add(random);
		
		return random;
	}
}
