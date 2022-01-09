package visitor.example.shapes;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    ShapeFactory factory;

    @Test
    public void testNormalCircleFactory() {
        Circle expectedResult = new Circle(2, 23, 15);

        factory = new CircleFactory();

        Circle acceptedResult = (Circle) factory.createNewShape(2, 23, 15);

        Assert.assertEquals(expectedResult, acceptedResult);
    }

    @Test
    public void testNormalRectangleFactory() {
        Rectangle expectedResult = new Rectangle(2, 23, 15);

        factory = new RectangleFactory();

        Rectangle acceptedResult = (Rectangle) factory.createNewShape(2, 23, 15);

        Assert.assertEquals(expectedResult, acceptedResult);
    }

    @Test
    public void testNormalDotFactory() {
        Dot expectedResult = new Dot(1, 53, 18);

        factory = new DotFactory();

        Dot acceptedResult = (Dot) factory.createNewShape(1, 53, 18);

        Assert.assertEquals(expectedResult, acceptedResult);
    }
}
