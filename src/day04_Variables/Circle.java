package day04_Variables;

public class Circle {
    public static void main(String[] args) {

   //can calculate the area perimeter of any given Circle
        //write a program that can convert kg (int) to pounds (double)
        //PI, radius, diameter, area, perimeter
        double radius = 5.5;
        double PI = 3.14;
        double diameter = radius * 2; // 10 * 2 // finds the diameter by multiplying the radius to 2
        double area = radius * radius * PI; // 10 * 10 * 3.14 //finds the area of the circle
        double perimeter = diameter * PI; // 10 * 2 * 3.14 //finds the perimeter of the circle


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        /*
Hint : PI = 3.14
area = radius * radius * PI
Perimeter = 2 * radius * PI
 */




    }
}
