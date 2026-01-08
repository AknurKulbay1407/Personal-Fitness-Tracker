import java.util.Scanner;

public class Main {
    public static void main() {
        Student student1 = new Student(1, "Aknur", 94.5);
        Student student2 = new Student(2, "Aruzhan", 88.5);
        Student student3 = new Student(3, "Azamat", 56.7);
        student3.setGrade(49.6);
        System.out.println("Id: " + student1.getStudentId() + "\nName: " + student1.getName() + "\nGrade: " + student1.getGrade());
        System.out.println("Id: " + student2.getStudentId() + "\nName: " + student2.getName() + "\nGrade: " + student2.getGrade());
        System.out.println("Id: " + student3.getStudentId() + "\nName: " + student3.getName() + "\nGrade: " + student3.getGrade());
    }
}
//Scanner sc = new Scanner(System.in);
//        int r1 = sc.nextInt();
//        int r2 = sc.nextInt();
//        int h = sc.nextInt();
//        Circle circle1 = new Circle(r1);
//        System.out.println(circle1.getRadius());
//        Cylinder cylinder1 = new Cylinder(r2, h);
//        System.out.println("the circumference: ");
//        circle1.circumference();
//        System.out.println("The area: ");
//        circle1.area();
//        System.out.println("the surface:");
//        cylinder1.surfaceArea();
//        System.out.println(" and volume:");
//        cylinder1.volume();