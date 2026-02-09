package homework001.exercises.circle;

public class Circle {

    private static final double DEFAULT_RADIUS = 1.0;
    private double radius;

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public Circle(double radius) {
        if (!isValidRadius(radius)) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!isValidRadius(radius)) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    private static boolean isValidRadius(double radius) {
        return radius > 0;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
