package by.jonline.one.basic;

/**
 *  Вычислить значения функции на отрезке [а,b] c шагом h:
 *        | x,x > 2
 *    y = |
 *        | -x,x <= 2
 **/

public class Cycle2 {
    public static void main(String[] args) {
    	
        double y;

        double a = -2;
        double b = 7;
        double h = 1.3;

        for (double x = a; x < b; x += h) {
        	if (x > 2){          // x,x >2
                y = x + x/10;
            } else {             // -x,x <=2
                y = - x - x/10;

            }
        	System.out.printf("x = %5.2f, y = %5.2f\n", x, y);

        }
    }
}
