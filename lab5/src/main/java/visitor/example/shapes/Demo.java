package visitor.example.shapes;

public class Demo {
    public static void main(String[] args) {
        String circle1 = "circle";
        String dot1 = "dot";
        String rectangle1 = "rectangle";

        //создание экзепляров фабричным методом
        Circle circle = (Circle) newShape(circle1, 2, 23, 15);
        circle.setRadius(10);

        Dot dot = (Dot) newShape(dot1,1, 10, 55);

        Rectangle rectangle = (Rectangle) newShape(rectangle1,3, 10, 17);
        rectangle.setWidth(20);
        rectangle.setHeight(30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);

        calculateAllSquare(circle, compoundShape);

    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }

    private static void calculateAllSquare(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.calculateAllSquare(shapes));
    }

    //выбор фабрики для создание экзепляра
    private static Shape newShape(String shape, int id, int x, int y) {
        ShapeFactory factory;
        if (shape.equals("circle")) {
            factory = new CircleFactory();
        } else if (shape.equals("dot")) {
            factory = new DotFactory();
        } else {
            factory = new RectangleFactory();
        }
        return factory.createNewShape(id, x, y);
    }
}
