package homework001.exercises.ball;
public class Ball {
    private static final int MIN_RADIUS = 1;
    private static final float MIN_POSITION = 0.0f;
    private float x;
    private float y;
    private int radius;
    private float xDelta;  // Velocity in X
    private float yDelta;  // Velocity in Y
    
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        if (x < MIN_POSITION) {
            throw new IllegalArgumentException("X cannot be negative: " + x);
        }
        if (y < MIN_POSITION) {
            throw new IllegalArgumentException("Y cannot be negative: " + y);
        }
        if (radius < MIN_RADIUS) {
            throw new IllegalArgumentException("Radius must be at least " + MIN_RADIUS + ": " + radius);
        }
        if (!Float.isFinite(xDelta)) {
            throw new IllegalArgumentException("xDelta must be a valid number");
        }
        if (!Float.isFinite(yDelta)) {
            throw new IllegalArgumentException("yDelta must be a valid number");
        }
        
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public float getXDelta() {
        return xDelta;
    }
    
    public float getYDelta() {
        return yDelta;
    }

    public void setX(float x) {
        if (x < MIN_POSITION) {
            throw new IllegalArgumentException("X cannot be negative: " + x);
        }
        if (!Float.isFinite(x)) {
            throw new IllegalArgumentException("X must be a valid number");
        }
        this.x = x;
    }

    public void setY(float y) {
        if (y < MIN_POSITION) {
            throw new IllegalArgumentException("Y cannot be negative: " + y);
        }
        if (!Float.isFinite(y)) {
            throw new IllegalArgumentException("Y must be a valid number");
        }
        this.y = y;
    }

    public void setRadius(int radius) {
        if (radius < MIN_RADIUS) {
            throw new IllegalArgumentException("Radius must be at least " + MIN_RADIUS + ": " + radius);
        }
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        if (!Float.isFinite(xDelta)) {
            throw new IllegalArgumentException("xDelta must be a valid number");
        }
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        if (!Float.isFinite(yDelta)) {
            throw new IllegalArgumentException("yDelta must be a valid number");
        }
        this.yDelta = yDelta;
    }

    public void move() {
        float newX = x + xDelta;
        float newY = y + yDelta;
        
        if (newX < MIN_POSITION) {
            throw new IllegalStateException(
                "Movement would result in negative X: " + newX + 
                ". Consider using reflectHorizontal() before move()."
            );
        }
        if (newY < MIN_POSITION) {
            throw new IllegalStateException(
                "Movement would result in negative Y: " + newY + 
                ". Consider using reflectVertical() before move()."
            );
        }
        
        x = newX;
        y = newY;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return String.format("Ball[(%.2f,%.2f), speed=(%.2f,%.2f)]", 
            x, y, xDelta, yDelta);
    }
}