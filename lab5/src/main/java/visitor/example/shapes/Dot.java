package visitor.example.shapes;

import java.util.Objects;

public class Dot implements Shape {
    private int id;
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public Double calculateSquare(Visitor visitor) {
        return 0.0;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dot)) return false;
        Dot dot = (Dot) o;
        return getId() == dot.getId() &&
                getX() == dot.getX() &&
                getY() == dot.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getX(), getY());
    }
}
