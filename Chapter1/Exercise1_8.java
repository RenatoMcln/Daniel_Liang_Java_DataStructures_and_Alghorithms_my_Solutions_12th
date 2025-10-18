package Chapter1;
/**
 * 1.8 (Area and perimeter of a circle) Write a program that displays the area and
 * perimeter of a circle that has a radius of 5.5 using the following formulas:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 */
public class Exercise1_8 {
    public static void main(String[] args) {
        //Display perimeter
        System.out.println("Perimeter is approximately = " + (2 * 5.5 * 3.14));
        //Display area
        System.out.println("Area is approximately = " + (5.5 * 5.5 * 3.14));
    }
}
