package visitor.example.shapes;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createNewShape(int id, int x, int y) {
        return new Rectangle(id, x, y);
    }
}
