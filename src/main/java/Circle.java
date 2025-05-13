public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double diameter() {
        return getRadius() * 2;
    }

    public double perimeter() {
        return getRadius() * 2 * Math.PI;
    }

    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
