package by.jonline.one.basic;

/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦 
 */

public class Line3 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double result;
		
		x = 34.5;
		y = 12.3;
		
		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
		System.out.println(result);

	}

}
