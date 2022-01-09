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

        factory = new CircleFactory();

        Rectangle acceptedResult = (Rectangle) factory.createNewShape(2, 23, 15);

        Assert.assertEquals(expectedResult, acceptedResult);
    }
}
