import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of your circle: ");
        radius = sc.nextDouble();

        double area = pi * radius * radius;
        System.out.println("The area with radius " + radius + "cm is: " + area + "cm2");

        sc.close();
    }
}
