package visitor.example.shapes;

public interface Shape {
    Double calculateSquare(Visitor visitor);
    String accept(Visitor visitor);
}
