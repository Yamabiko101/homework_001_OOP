package homework001.exercises.ball;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void testConstructorSuccess() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        assertEquals(100.0f, ball.getX(), 0.001f);
        assertEquals(200.0f, ball.getY(), 0.001f);
        assertEquals(10, ball.getRadius());
        assertEquals(5.0f, ball.getXDelta(), 0.001f);
        assertEquals(-3.0f, ball.getYDelta(), 0.001f);
    }

    @Test
    void testConstructorNegativeX() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Ball(-10.0f, 200.0f, 10, 5.0f, 3.0f);
        });
        assertTrue(exception.getMessage().contains("X cannot be negative"));
    }

    @Test
    void testConstructorNegativeY() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ball(100.0f, -50.0f, 10, 5.0f, 3.0f);
        });
    }

    @Test
    void testConstructorInvalidRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Ball(100.0f, 200.0f, 0, 5.0f, 3.0f);
        });
        assertTrue(exception.getMessage().contains("Radius must be at least"));
    }

    @Test
    void testConstructorNaNVelocity() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ball(100.0f, 200.0f, 10, Float.NaN, 3.0f);
        });
    }

    @Test
    void testMoveSuccess() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        // Initial: x=100, y=200, xDelta=5, yDelta=-3
        ball.move();

        // Expected: x=105, y=197
        assertEquals(105.0f, ball.getX(), 0.001f);
        assertEquals(197.0f, ball.getY(), 0.001f);
    }

    @Test
    void testMoveMultipleTimes() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        ball.move(); // x=105, y=197
        ball.move(); // x=110, y=194
        ball.move(); // x=115, y=191

        assertEquals(115.0f, ball.getX(), 0.001f);
        assertEquals(191.0f, ball.getY(), 0.001f);
    }

    @Test
    void testMoveNegativeX() {
        Ball ball2 = new Ball(10.0f, 100.0f, 10, -20.0f, 0.0f);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            ball2.move();
        });
        assertTrue(exception.getMessage().contains("Movement would result in negative X"));
        assertTrue(exception.getMessage().contains("reflectHorizontal"));
    }

    @Test
    void testMoveNegativeY() {
        Ball ball2 = new Ball(100.0f, 5.0f, 10, 0.0f, -10.0f);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            ball2.move();
        });
        assertTrue(exception.getMessage().contains("Movement would result in negative Y"));
        assertTrue(exception.getMessage().contains("reflectVertical"));
    }

    @Test
    void testReflectHorizontal() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        float originalXDelta = ball.getXDelta();

        ball.reflectHorizontal();

        assertEquals(-originalXDelta, ball.getXDelta(), 0.001f);
        assertEquals(-3.0f, ball.getYDelta(), 0.001f); // yDelta unchanged
    }

    @Test
    void testReflectVertical() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        float originalYDelta = ball.getYDelta();

        ball.reflectVertical();

        assertEquals(5.0f, ball.getXDelta(), 0.001f); // xDelta unchanged
        assertEquals(-originalYDelta, ball.getYDelta(), 0.001f);
    }

    @Test
    void testReflectHorizontalTwice() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        float originalXDelta = ball.getXDelta();

        ball.reflectHorizontal();
        ball.reflectHorizontal();

        assertEquals(originalXDelta, ball.getXDelta(), 0.001f);
    }

    @Test
    void testSetXNegative() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            ball.setX(-10.0f);
        });
    }

    @Test
    void testSetYNegative() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            ball.setY(-5.0f);
        });
    }

    @Test
    void testSetRadiusInvalid() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            ball.setRadius(0);
        });
    }

    @Test
    void testSetXDeltaNaN() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            ball.setXDelta(Float.NaN);
        });
    }

    @Test
    void testSetYDeltaInfinity() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            ball.setYDelta(Float.POSITIVE_INFINITY);
        });
    }

    @Test
    void testToString() {
        Ball ball = new Ball(100.0f, 200.0f, 10, 5.0f, -3.0f);
        String result = ball.toString();

        assertTrue(result.contains("100"));
        assertTrue(result.contains("200"));
        assertTrue(result.contains("5"));
        assertTrue(result.contains("-3"));
    }
}