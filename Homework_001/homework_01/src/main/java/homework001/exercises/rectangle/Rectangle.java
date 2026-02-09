package homework001.exercises.rectangle;
public class Rectangle {
    private static final float DEFAULT_LENGTH = 1.0f;
    private static final float DEFAULT_WIDTH = 1.0f;
    private float length;
    private float width;

    public Rectangle() {
        this(DEFAULT_LENGTH, DEFAULT_WIDTH);
    }

    public Rectangle(float length, float width) {
        if (!isValidDimension(length) || !isValidDimension(width)) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (!isValidDimension(length)) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (!isValidDimension(width)) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    private static boolean isValidDimension(float dimension) {
        return dimension > 0;
    }

    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}