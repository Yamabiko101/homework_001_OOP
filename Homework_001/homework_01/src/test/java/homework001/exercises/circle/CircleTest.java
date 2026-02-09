package homework001.exercises.circle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    @Test
    void defaultConstructor_shouldCreateCircleWithDefaultRadius() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius());
    }

    @Test
    void constructorWithValidRadius_shouldSetRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void constructorWithInvalidRadius_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
        assertThrows(IllegalArgumentException.class, () -> new Circle(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Circle(Double.NEGATIVE_INFINITY));
    }

    @Test
    void setRadius_withInvalidValue_shouldThrowException() {
        Circle circle = new Circle();
        assertThrows(IllegalArgumentException.class, () -> circle.setRadius(-3));
    }

    @Test
    void getArea_shouldReturnCorrectArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0001);
    }

    @Test
    void getCircumference_shouldReturnCorrectValue() {
        Circle circle = new Circle(3.0);
        assertEquals(2 * Math.PI * 3, circle.getCircumference(), 0.0001);
    }

    @Test
    void toString_shouldReturnExpectedFormat() {
        Circle circle = new Circle(2.5);
        assertEquals("Circle[radius=2.5]", circle.toString());
    }
}
