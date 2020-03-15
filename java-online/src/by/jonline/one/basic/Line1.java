package by.jonline.one.basic;

/**
*
*  Найдите значение функции: z = ((a–3)*b/2)+c.
*  
**/

public class Line1 {
	
	public static void main(String[] args) {

       double a = 67;
       double b = 2.3;
       double c = -4;
       
       double z = ((a - 3) * b / 2) + c;

       System.out.println("Функция z = ((a–3)*b/2)+c");
       System.out.println("в которой");
       System.out.println("a = "+a);
       System.out.println("b = "+b);
       System.out.println("c = "+c);
       System.out.print("имеет значение z = ");
       System.out.println(z);
   }
	
}