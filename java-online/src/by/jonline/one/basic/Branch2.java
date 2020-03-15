package by.jonline.one.basic;

/*
 *
 * 2. Найти max{min(a, b), min(c, d)}.
 *
 */

public class Branch2 {
    
	public static void main(String[] args) {

        int a = 345;
        int b = -233;
        int c = -12415;
        int d = -34;

        // Очевидное решение:    
        // System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
        // если нужно использовать ветвления то:
        
        if (a < b && (a > c || a > d)){
            System.out.println(a);
        } else if (b > c || b > d) {
            System.out.println(b);
        } else if (c < d){
            System.out.println(d);
        } else {
            System.out.println(d);
        }
    }
}