package by.jonline.one.basic;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Cycle6 {
    public static void main (String [] args){
        
    	int start;
    	int end;
    	
    	start = 3000;
    	end = 4000;
    	
    	
    	for (int i = start; i <= end; i++) {
            char sumbol = (char) i;
            System.out.println(sumbol+ " имеет численное обозначение - "+i);
        }
    }
}
