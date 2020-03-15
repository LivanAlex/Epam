package by.jonline.one.basic;

/*
 *       Вычислить значение функции:
 *             | x2-3x+9, если x<= 3
 *      F(x) = |
 *             |1/(x3 + 6), если x >3
 */

public class Branch5 {
	
    public static void main(String[] args) {
    	
        double x = 2;
        double result;
        
        if (x <= 3){
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        
        System.out.println(result);
    }
}
