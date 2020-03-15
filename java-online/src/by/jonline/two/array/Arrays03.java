package by.jonline.two.array;

/*
 * Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */


public abstract class Arrays03 {

	
	public static void main(String[] args) {
		
		
		
		int n;
		double [] arr;
		final String MESSAGE;
		int pnz [];
		
		n = 12; 
		arr = Generator.randomDoubleArray(n, -100, 100);
		// массив double[N] c случайными действительными числами от -100 до 100
		MESSAGE = "В массиве %d положительных чисел, %d отрицательных, равных нулю - %d%n";
		pnz = calculatePositiveNegativeZero(arr);
		
	
		Out.print(arr, 2);
		
		System.out.printf(MESSAGE, pnz[0], pnz[1], pnz[2]);
	}
	

	private static int[] calculatePositiveNegativeZero (double [] array) {
		
		int [] pnz;
		pnz = new int [3];
		
		for (double i : array){
			
			if (i > 0){
				pnz[0]++;
			} else if (i < 0){
				pnz[1]++;
			} else {
				pnz[2]++;
			}
		}
		
		return pnz;
	}
	
	
}




