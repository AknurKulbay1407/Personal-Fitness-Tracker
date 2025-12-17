import java.util.Scanner;

public class Main {
    public static void main () {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int h = sc.nextInt();
        Circle circle1 = new Circle(r1);
        System.out.println(circle1.getRadius());
        Cylinder cylinder1 = new Cylinder(r2, h);
        System.out.println("the circumference: ");
        circle1.circumference();
        System.out.println("The area: ");
        circle1.area();
        System.out.println("the surface:");
        cylinder1.surfaceArea();
        System.out.println(" and volume:");
        cylinder1.volume();
    }

}