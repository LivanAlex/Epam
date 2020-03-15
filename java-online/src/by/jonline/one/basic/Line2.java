package by.jonline.one.basic;
/*
*
* 2. Вычислить значение выражения по формуле
* (все переменные принимают действительные значения):
* (𝑏+√(𝑏2 +4𝑎𝑐))/2a - 𝑎3𝑐+𝑏−2
*
*/

public class Line2 {
   public static void main(String[] args) {
	   
       double a;
       double b;
       double c;
       double result;
       
       a = 123.23;
       b = -123.23;
       c = 142.23;

       result = (b + Math.sqrt(Math.pow(b,2) + (4 * a * c))) / (2 * a) - Math.pow(a,3) * c + Math.pow(b, -2);

       System.out.println(result);
   }
}