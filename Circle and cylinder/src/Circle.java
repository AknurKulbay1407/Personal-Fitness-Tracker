public class Circle {
    private int radius;
    int p = 3;

    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }

    public void circumference() {
        System.out.println(2 * p * radius);
    }

    public void area() {
        System.out.println(p * radius * radius);
    }

    public String toString() {
        System.out.println("Circle with + radius: " + radius);
        return "";
    }
}
