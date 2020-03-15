package by.jonline.two.array;

/*
 * Даны дроби p1 / q1, p2 / q2, ... , pn / qn ( pi , qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему знаменателю
 * и упорядочивает их в порядке возрастания.
 */

public class Sort08 {

	public static void main(String[] args) {
		
		Fraction [] pq2;
		
		int commonDenominator;
		final String MESSAGE;
		final String DENOMINATOR;
		final String BRING_FRACTION;
		
		pq2 = new Fraction [3];
		
		MESSAGE = "Для дробей:";
		DENOMINATOR = "\nобщий знаменатель равен: %d\n";
		BRING_FRACTION = "эти же дроби в порядке возрастания, приведенные к общему знаменталелю:";
		
		int num;
		int den;
		
		for (int i = 0; i < pq2.length; i++) {
			num = Generator.randomInt(1, 20);
			den = Generator.randomInt(2, 5);
			pq2[i] = new Fraction(num, den);
		}
		
		commonDenominator = findCommonDenominator(pq2);
		
		System.out.println(MESSAGE);

		print(pq2);
		
		System.out.printf(DENOMINATOR, commonDenominator);
		

		bringFraction(pq2, commonDenominator);
		
		System.out.println(BRING_FRACTION);
	
		sortUp(pq2);

		print(pq2);

	}
	
	
	private static void sortUp(Fraction[] array) {
		
		for (int i = array.length-1; i >= 0; i--){
			int max = Integer.MIN_VALUE;
			int indexMax = 0;
			for (int j = 0; j <= i; j++) {
				if (array[j].getNumerator() > max) {
					max = array[j].getNumerator();
					indexMax = j;
				}
			}
			if (array[i].getNumerator() == max) {
				continue;
			} else {
				Fraction temp = array[indexMax];
				array[indexMax] = array[i];
				array[i] = temp;
			}
		}
		
	}


	// приведение к общему знаменателю
	private static void bringFraction(Fraction [] array, int commonDenominator) {
		for (int i = 0; i < array.length; i++) {
			array[i].setNumerator(array[i].getNumerator() * (commonDenominator / array[i].getDenominator()));
			array[i].setDenominator(commonDenominator);
		}
		
	}

	// возвращает наибольший общий делитель
	private static int findNod(int a, int b){
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		while (a % b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return b;		
	}
	
	
	// возвращает общий делитель
	private static int findCommonDenominator(Fraction [] array){
		int commonDenominator = array[0].getDenominator();
		for (int i = 1; i < array.length; i++) {
			commonDenominator = findNocForNum(array[i].getDenominator(), commonDenominator);
		}
		return commonDenominator;
	}
	
	
	
	// возвращает наименьшее общее кратное двух чисел
	private static int findNocForNum(int a,int b){
		int noc;
		int nod;
		
		nod = findNod(a,b);
		noc = Math.abs(a*b)/nod;
		
		return noc;
	}
	
	
	private static void print(Fraction [] array){
		for (Fraction i : array) {
			System.out.printf("%d/%d, ", i.getNumerator(), i.getDenominator());
		}
	}
}
