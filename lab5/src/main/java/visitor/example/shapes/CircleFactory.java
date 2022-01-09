package visitor.example.shapes;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createNewShape(int id, int x, int y) {
        return new Circle(id, x, y);
    }
}
