package visitor.example.shapes;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<Shape>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public Double calculateSquare(Visitor visitor) {
        return visitor.calculateCompoundShapeSquare(this);
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public List<Shape> getChildren() {
        return children;
    }
}
