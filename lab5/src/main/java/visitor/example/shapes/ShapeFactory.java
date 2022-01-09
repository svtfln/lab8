package visitor.example.shapes;

public interface ShapeFactory {
    Shape createNewShape(int id, int x, int y);
}
