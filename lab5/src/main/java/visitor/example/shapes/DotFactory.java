package visitor.example.shapes;

public class DotFactory implements ShapeFactory{
    @Override
    public Shape createNewShape(int id, int x, int y) {
        return new Dot(id, x, y);
    }
}
