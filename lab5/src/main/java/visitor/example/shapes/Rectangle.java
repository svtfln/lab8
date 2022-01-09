package visitor.example.shapes;

import java.util.Objects;

public class Rectangle implements Shape {
    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    @Override
    public Double calculateSquare(Visitor visitor) {
        return visitor.calculateRectangleSquare(this);
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getId() == rectangle.getId() &&
                getX() == rectangle.getX() &&
                getY() == rectangle.getY() &&
                getWidth() == rectangle.getWidth() &&
                getHeight() == rectangle.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getX(), getY(), getWidth(), getHeight());
    }
}
