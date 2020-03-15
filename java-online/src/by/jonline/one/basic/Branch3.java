package by.jonline.one.basic;

/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3)
 * Определить, будут ли они расположены на одной прямой.
 **/

public class Branch3 {
    public static void main(String[] args) {
        
    	float x1 = 0.0f;
        float y1 = 0.0f;

        float x2 = -3.233f;
        float y2 = -3.233f;

        float x3 = 6.0f;
        float y3 = 6.0f;

        if ((x1-x2)/(x3-x2) == (y1-y2)/(y3-y2)) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Нет прямой содержащих эти точки");
            
        }
        
    }
}
