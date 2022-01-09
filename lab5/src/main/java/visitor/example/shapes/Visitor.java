package visitor.example.shapes;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    Double calculateCircleSquare(Circle circle);

    String visitRectangle(Rectangle rectangle);

    Double calculateRectangleSquare(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

    Double calculateCompoundShapeSquare(CompoundShape compoundShape);

    String calculateAllSquare(Shape... args);
}
