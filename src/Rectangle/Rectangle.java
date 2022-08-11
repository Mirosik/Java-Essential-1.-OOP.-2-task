package Rectangle;

import java.util.Scanner; //                                                 Задание 2

public class Rectangle {
    static double perimeterCalculator (double side1, double side2) {
        return (side1 * 2) + (side2 * 2);
    }
     static double areaCalculator (double side1, double side2) {
         return side1 * side2;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Первая сторона прямоугольника:");
        double side1 = number.nextDouble();
        System.out.println("Вторая сторона прямоугольника:");
        double side2 = number.nextDouble();
        System.out.println("Периметр прямоугольника "+perimeterCalculator(side1, side2));
        System.out.println("Площадь прямоугольника "+areaCalculator(side1, side2));
    }
}
