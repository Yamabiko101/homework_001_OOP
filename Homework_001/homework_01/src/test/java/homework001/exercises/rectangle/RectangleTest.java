package homework001.exercises.rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    void defaultConstructor_shouldCreateRectangleWithDefaultDimensions() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getLength());
        assertEquals(1.0, rectangle.getWidth());
    }

    @Test
    void constructorWithValidDimensions_shouldSetDimensions() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(5.0, rectangle.getLength());
        assertEquals(3.0, rectangle.getWidth());
    }

    @Test
    void constructorWithInvalidDimensions_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 3.0f));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5.0f, -3.0f));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Float.NaN, 3.0f));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5.0f, Float.NEGATIVE_INFINITY));
    }

    @Test
    void setLength_withInvalidValue_shouldThrowException() {
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(-3.0f));
    }

    @Test
    void setWidth_withInvalidValue_shouldThrowException() {
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(0f));
    }

    @Test
    void getArea_shouldReturnCorrectArea() {
        Rectangle rectangle = new Rectangle(4.0f, 2.0f);
        assertEquals(8.0, rectangle.getArea());
    }

    @Test
    void getPerimeter_shouldReturnCorrectPerimeter() {
        Rectangle rectangle = new Rectangle(3.0f, 5.0f);
        assertEquals(16.0, rectangle.getPerimeter());
    }

    @Test
    void toString_shouldReturnExpectedFormat() {
        Rectangle rectangle = new Rectangle(2.5f, 1.5f);
        assertEquals("Rectangle[length=2.5, width=1.5]", rectangle.toString());
    }
}