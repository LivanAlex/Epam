package by.jonline.one.basic;

/*
 * 5. Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид:
        a=1/(2^n)+1/(3^n)
 */

public class Cycle5 {
    public static void main(String[] args) {
    	
       double e;
       double r;
       double sum;
       
       e = 0.001;
       r = 0;
       sum = 0;
       
        for (int i = 1; Math.abs(r) < e; i++) {
            r = 1/Math.pow(2,i) + 1/Math.pow(3,i);
            sum += r;
        }
        
        System.out.println("сумма членов ряда, a=1/(2^n)+1/(3^n) модуль которых больше или равен " + e + ":");
        System.out.println(sum);
        
    }
}
