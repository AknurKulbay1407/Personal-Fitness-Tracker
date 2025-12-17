public class Cylinder {
    private int radius;
    private int height;
    int p = 3;

    public int getRadius() {
        return this.radius;
    }
    public int getHeight() {
        return this.radius;
    }
    public Cylinder (int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public void surfaceArea () {
        System.out.println(2 * p * radius * (height + radius));
    }
    public void volume () {
        System.out.println(p * radius * radius * height);

    }
    public String toString () {
        System.out.println("Cylinder with radius: " + radius + " " + "and height: " + height);
        return "";
    }
}
