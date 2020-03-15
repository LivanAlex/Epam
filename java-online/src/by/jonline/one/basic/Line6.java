package by.jonline.one.basic;

/*
 *  6. Для данной области составить линейную программу, которая печатает true,
 *  если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
 *  
 *  картинка там:
 *  
 *  https://github.com/Java0Tutor/1_Basics_of_software_code_development
 */

public class Line6 {

    public static void main(String[] args) {

        float x;
        float y;
        boolean isBelong;
        
        x = 1.3f;
        y = -2.2f;
        
        isBelong = ((y > 0 && y < 4 && Math.abs(x) < 2) || (y > -3 && y < 0 && Math.abs(x) < 4));

        System.out.println(isBelong);
    }
}