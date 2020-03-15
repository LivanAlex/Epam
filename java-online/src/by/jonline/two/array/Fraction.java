package by.jonline.two.array;

public class Fraction {
	
	
	private int numerator;
	private int denominator;
	

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
		// временное решение чтобы не позволить создать дробь со знаменателем равным нулю
		if (denominator == 0) {
			   throw new IllegalArgumentException("знаменатель не может быть равен нулю!");
		}
	}
	
	
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	

}
