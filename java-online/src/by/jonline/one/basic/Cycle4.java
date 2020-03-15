package by.jonline.one.basic;

//import java.math.BigInteger;

/*
 *  Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycle4 {
    public static void main(String[] args) {
    	
    	/*
    	BigInteger result = new BigInteger(String.valueOf(1));
        BigInteger temp;
        
        for (long i = 1; i < 200; i++) {
            temp = BigInteger.valueOf(i*i);
            result = result.multiply(temp);
        }
        
        System.out.println("Произведение квадратов первых двухсот чисел равно:");
        System.out.println(result);
         */
    	
    	//код выше находит произведения квадратов первых двухсот чисел.
    	
    	long result = 1;
        long temp;
        int countOfNum = 200;
        boolean isBigNum = false;
        
        for (int i = 1; i <= countOfNum; i++) {
        	
        	temp = result;
            result *= (i*i);
            
            if (result < temp) {
            	System.out.println("технологии еще далеки от идеала");
            	System.out.println("удалось сочитать только произведение квадратов первых " + (i-1) + " чисел");
            	System.out.println("оно равно: " + temp);
            	isBigNum = true;
            	break;
            }
            
        }
        
        if (!isBigNum) {
        	System.out.println("Произведение квадратов первых " + countOfNum + " чисел равно:");
            System.out.println(result);
        }
    }
}
