package visitor.example.shapes;

import java.util.Objects;

public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    public Circle(int id, int x, int y) {
        super(id, x, y);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateSquare(Visitor visitor) {
        return visitor.calculateCircleSquare(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
