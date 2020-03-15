package by.jonline.one.basic;

/*
 *  4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *  Поменять местами дробную и целую части числа и вывести полученное значение числа.
 *
 */

public class Line4 {
	
    public static void main(String[] args) {
    	
    	float r;
        int first;
        int second;
        float result;
        
        r = 703.004f;
        
        first = (int) r;              
        second = (int) (r * 1000) - first * 1000;
        result = second + (float) first / 1000;
        

        System.out.format("%07.3f - исходное число%n", r);
        System.out.format("%07.3f - преобразованное число%n", result);

       
    }
}