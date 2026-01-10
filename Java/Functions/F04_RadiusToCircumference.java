// Program to calculate the circumference of a circle using radius and a function
import java.util.Scanner;

public class F04_RadiusToCircumference {
    public static double calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nLet's find circumference of of a circle...");
        System.out.print("\nEnter the radious of a circle: ");
        double radius = sc.nextInt();

        System.out.println("\nCircumference of circle: " +calculateCircumference(radius));
        sc.close();
    }
}

/*
Output:
Let's find circumference of of a circle...

Enter the radious of a circle: 10

Circumference of circle: 62.83185307179586
*/
