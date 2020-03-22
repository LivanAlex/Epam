package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/* Даны действительные числа a1,a2,...,a2n . Найти 
 * max(a1 +a2n,a2 +a2n−1,...,an +an+1).
 */

public class Arrays07 {

	public static void main(String[] args) {

		double [] arr;
		double max;
		
		arr = Generator.randomDoubleArray(10, -10, 10);
		Out.print(arr, 2);
		
		max = calculate(arr);
	
		System.out.printf("%.2f",max);
	}

	
	private static double calculate (double [] x){
		
		double max = Double.NEGATIVE_INFINITY;
		
		for (int i = 0, b = x.length-1; i <= b; i++, b--){   
									//  i <= b - удвоит число в середине массива (если их нечетное количество)
									//  i < b  - не будет брать это число в учет
			//System.out.printf("%5.2f + %5.2f = %6.2f%n", +x[i], x[b], (x[i]+x[b])); // раскоментировать чтобы убедиться в работоспособности
			if (x[i]+x[b] > max){
				max = x[i]+x[b];
			}
		}
		
		return max;
	}
}
