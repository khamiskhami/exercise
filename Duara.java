import java.util.*;

public class Duara {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input =  new Scanner(System.in);
        System.out.println("Please Enter radius: ");
        double radius = input.nextDouble();
        double diameter = 2 * radius;
        System.out.println("Diameter of circle is: " + diameter);
        double circumference = 2 * PI * radius;
        System.out.println("Circumference is : " + circumference);
        double area = PI * radius*radius;
        System.out.println("Area of Duara is: " + area);

    }
}