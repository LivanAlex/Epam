package by.jonline.one.basic;

/*
 *
 * 4 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 *
 */

public class Branch4 {
    public static void main(String[] args) {

        // стороны прямоугольного отверстия
        int a = 2;
        int b = 1;

        // размеры х, у, z кирпича
        int x = 5;
        int y = 4;
        int z = 3;

        int temp; // временная переменная для сортировки

        // сортировка сторон прямоугольного отверстия
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }

        // сортировка сторон кирпича
        if (x > y){               // 321, 312, 213
            if (x > z) {
                if (y < z){       // 312
                    temp = z;
                    z = x;
                    x = y;
                    y = temp;
                } else {           // 321
                    temp = x;
                    x = z;
                    z = temp;
                }
            } else {               // 213
                temp = x;
                x = y;
                y = temp;
            }
        } else if (y > z) {         // 231
            temp = z;
            z = y;
            y = x;
            x = temp;
        }

        // сравниваем меньшие стороны отверстия с меньшими сторонами кирпича
        if (a < x && b < y) {
            System.out.println("Кирпич пролезет в отверстие");
        } else {
            System.out.println("Кирпич не пролезет в отверстие");
        }
    }
}
