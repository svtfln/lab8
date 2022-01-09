package visitor.example.shapes;

import org.junit.Assert;
import org.junit.Test;

public class VisitorTest {
    private XMLExportVisitor visitor = new XMLExportVisitor();

    @Test
    public void testNormalCalculateSquare() {
        String expectedResult = "314,16";

        Circle circle = new Circle(2, 23, 15, 10);
        String acceptedResult = visitor.calculateAllSquare(circle);
        Assert.assertEquals(expectedResult, acceptedResult);
    }

    @Test
    public void testWithoutShapesCalculateSquare() {
        String expectedResult = "0,00";

        Circle circle = new Circle(2, 23, 15, 10);
        String acceptedResult = visitor.calculateAllSquare();
        Assert.assertEquals(expectedResult, acceptedResult);
    }

    @Test
    public void testNormalVisitRectangle() {
        String expectedResult = "<rectangle>\n" +
                "    <id>3</id>\n" +
                "    <x>10</x>\n" +
                "    <y>17</y>\n" +
                "    <width>20</width>\n" +
                "    <height>30</height>\n" +
                "</rectangle>";

        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);
        String acceptedResult = visitor.visitRectangle(rectangle);
        Assert.assertEquals(expectedResult, acceptedResult);
    }

    @Test
    public void testNormalExport() {
        String expectedResult = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<circle>\n" +
                "    <id>2</id>\n" +
                "    <x>23</x>\n" +
                "    <y>15</y>\n" +
                "    <radius>10</radius>\n" +
                "</circle>\n" +
                "<compound_graphic>\n" +
                "   <id>4</id>\n" +
                "    <dot>\n" +
                "        <id>1</id>\n" +
                "        <x>10</x>\n" +
                "        <y>55</y>\n" +
                "    </dot>\n" +
                "    <circle>\n" +
                "        <id>2</id>\n" +
                "        <x>23</x>\n" +
                "        <y>15</y>\n" +
                "        <radius>10</radius>\n" +
                "    </circle>\n" +
                "    <rectangle>\n" +
                "        <id>3</id>\n" +
                "        <x>10</x>\n" +
                "        <y>17</y>\n" +
                "        <width>20</width>\n" +
                "        <height>30</height>\n" +
                "    </rectangle>\n" +
                "    <compound_graphic>\n" +
                "       <id>5</id>\n" +
                "        <dot>\n" +
                "            <id>1</id>\n" +
                "            <x>10</x>\n" +
                "            <y>55</y>\n" +
                "        </dot>\n" +
                "    </compound_graphic>\n" +
                "</compound_graphic>\n";

        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        String acceptedResult = visitor.export(circle, compoundShape);

        Assert.assertEquals(expectedResult, acceptedResult);

    }
}
