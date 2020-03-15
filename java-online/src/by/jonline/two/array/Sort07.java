package by.jonline.two.array;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1<=  b2 <= ... <=  bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности
 * b <=  b <=  ... <=  b в первую последовательность так,
 * чтобы новая последовательность оставалась возрастающей.
 */

public class Sort07 {

	public static void main(String[] args) {
		
		
		
		double [] a;
		double [] b;
		final String MESSAGE; 
		
		a = new double [9];
		b = new double [9];
		MESSAGE = "Чтобы получить неубывающую последовательность нужно вставить \n"
				+ "элементы второй последовательности в первую в следующем порядке:\n";
		
		Generator.fill(a, 0, 9);
		Sorter.sortUpArr(a);
		Generator.fill(b, 0, 9);
		Sorter.sortUpArr(b);
		
		Out.print(a, 2);
		System.out.println("");
		
		Out.print(b, 2);
		System.out.println("");
		
		System.out.println(MESSAGE);
		
		for (int i = b.length - 1; i != -1; i--) {
			int index = binarySearch(a, b[i]);
			System.out.printf("%.2f - %d\n", b[i], index);
		}

	}
	
	public static int binarySearch(double [] array, double key){
		int startIndex = 0;
		int endIndex = array.length-1;
	    while(startIndex <= endIndex){
	    	int index = (startIndex + endIndex) / 2;
	    	if(array[index] < key) {
	    		startIndex = index + 1;
	    	} else if (array[index] < key) {
	    		endIndex = index - 1;
	    	} else {
	        return index;
	    	}
	    }
	    return startIndex;
	}
	
}
