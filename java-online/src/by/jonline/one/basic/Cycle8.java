package by.jonline.one.basic;

import java.util.Scanner;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Cycle8 {

    public static void main (String [] args){
    	
        int a;
        int b;
        
        String strA;
        String strB;
        String result;

        a = 84382;
        b = 2864;
       
        strA = "" + Math.abs(a);  // на случай отрицательных чисел
        strB = "" + Math.abs(b);
        result = "";
        
        
        for (int i = 0; i < strA.length(); i++) {
            for (int j = 0; j < strB.length(); j++) {
                if (strA.charAt(i) == strB.charAt(j)) {
                
                    if (!result.contains("" + strA.charAt(i))){
                        result += "" + strA.charAt(i);
                    }
                }
            }
        }
       
        if (result.length()<1){
        	
            System.out.println("У чисел " + a + " и " + b + " нет общих цифр");
            
        } else {
        	
            String massage = "В числах " + a + " и " + b + " общими цифрами являются: ";
            System.out.println(massage + result);
            
        }
    }


}