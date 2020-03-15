package by.jonline.one.basic;

/*
 *  Найти сумму квадратов первых ста чисел.
 */

public class Cycle3 {
    public static void main(String[] args) {
       
    	int result;
    	result = 0;
        
    	for (int i = 0; i < 100; i++) {
            result += i*i;
        }
        
    	System.out.print("Сумма квадратов первых ста чисел равна: ");
        System.out.println(result);
    }
}
