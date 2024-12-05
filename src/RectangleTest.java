import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle(new Point(4, 2), 8, 4);
    @Test
    void getWidth() {
        assertEquals(8, rectangle.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(4, rectangle.getHeight());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(6);
        assertEquals(6, rectangle.getWidth());

        assertEquals(1, rectangle.getPoints()[0].getX()); //check the new coordinates
        assertEquals(4, rectangle.getPoints()[0].getY()); //top left coordinates

        assertEquals(7, rectangle.getPoints()[1].getX());
        assertEquals(4, rectangle.getPoints()[1].getY()); //top right coordinates

        assertEquals(7, rectangle.getPoints()[2].getX());
        assertEquals(0, rectangle.getPoints()[2].getY()); //bottom right coordinates

        assertEquals(1, rectangle.getPoints()[3].getX());
        assertEquals(0, rectangle.getPoints()[3].getY()); //bottom left coordinates


    }

    @Test
    void setHeight() {
        rectangle.setHeight(10);
        assertEquals(10, rectangle.getHeight());

        assertEquals(0, rectangle.getPoints()[0].getX()); //check the new points
        assertEquals(7, rectangle.getPoints()[0].getY()); //top left coordinates

        assertEquals(8, rectangle.getPoints()[1].getX());
        assertEquals(7, rectangle.getPoints()[1].getY()); //top right coordinates

        assertEquals(8, rectangle.getPoints()[2].getX());
        assertEquals(-3, rectangle.getPoints()[2].getY()); //bottom right coordinates

        assertEquals(0, rectangle.getPoints()[3].getX());
        assertEquals(-3, rectangle.getPoints()[3].getY()); //bottom left coordinates

    }

    @Test
    void getCenter(){
        assertEquals(4, rectangle.getCenter().getX());
        assertEquals(2, rectangle.getCenter().getY());
    }

    @Test
    void setCenter(){
        Rectangle rectangle1 = new Rectangle(new Point(4, 2), 8, 4);
        rectangle.setCenter(new Point(8, 4));
        assertEquals(8, rectangle.getCenter().getX());
        assertEquals(4, rectangle.getCenter().getY());
        assertEquals(4, rectangle1.getPoints()[0].getX()); //make sure points move too
        assertEquals(6, rectangle1.getPoints()[0].getY()); //top left coordinates

        assertEquals(12, rectangle1.getPoints()[1].getX()); //top right
        assertEquals(6, rectangle1.getPoints()[1].getY());

        assertEquals(12, rectangle1.getPoints()[2].getX()); //bottom right
        assertEquals(2, rectangle1.getPoints()[2].getY());

        assertEquals(4, rectangle1.getPoints()[3].getX()); //bottom left
        assertEquals(2, rectangle1.getPoints()[3].getY());
    }

    @Test
    void getPoints(){
        Rectangle rectangle2 = new Rectangle(new Point(0, 0), 4, 2);
        assertEquals(0, rectangle2.getCenter().getX());
        assertEquals(0, rectangle2.getCenter().getY());

        assertEquals(-2.0, rectangle2.getPoints()[0].getX()); //top left
        assertEquals(1.0, rectangle2.getPoints()[0].getY());

        assertEquals(2.0, rectangle2.getPoints()[1].getX()); //top right
        assertEquals(1.0, rectangle2.getPoints()[1].getY());

        assertEquals(2.0, rectangle2.getPoints()[2].getX()); //bottom right
        assertEquals(-1.0, rectangle2.getPoints()[2].getY());

        assertEquals(-2.0, rectangle2.getPoints()[3].getX()); //bottom left
        assertEquals(-1.0, rectangle2.getPoints()[3].getY());

        rectangle2.setCenter(new Point(2, 1));

        assertEquals(2, rectangle2.getCenter().getX());
        assertEquals(1, rectangle2.getCenter().getY());

        assertEquals(0.0, rectangle2.getPoints()[0].getX()); //top left
        assertEquals(2.0, rectangle2.getPoints()[0].getY());

        assertEquals(4.0, rectangle2.getPoints()[1].getX()); //top right
        assertEquals(2.0, rectangle2.getPoints()[1].getY());

        assertEquals(4.0, rectangle2.getPoints()[2].getX()); //bottom right
        assertEquals(0.0, rectangle2.getPoints()[2].getY());

        assertEquals(0, rectangle2.getPoints()[3].getX()); //bottom left
        assertEquals(0.0, rectangle2.getPoints()[3].getY());


    }

    @Test void getLines(){
        Rectangle rectangle3 = new Rectangle(new Point(0, 0), 4, 2);

        assertEquals(-2.0, rectangle3.getLines()[0].getFirstPoint().getX()); //first line, first point (top left)
        assertEquals(1.0, rectangle3.getLines()[0].getFirstPoint().getY());

        assertEquals(2.0, rectangle3.getLines()[0].getSecondPoint().getX()); //first line, first point (top right)
        assertEquals(1.0, rectangle3.getLines()[0].getSecondPoint().getY());

        assertEquals(2.0, rectangle3.getLines()[1].getFirstPoint().getX()); //second line, first point (top right)
        assertEquals(1.0, rectangle3.getLines()[1].getFirstPoint().getY());

        assertEquals(2.0, rectangle3.getLines()[1].getSecondPoint().getX()); //second line, second point (bottom right)
        assertEquals(-1.0, rectangle3.getLines()[1].getSecondPoint().getY());

        assertEquals(2.0, rectangle3.getLines()[2].getFirstPoint().getX()); //third line, first point (bottom right)
        assertEquals(-1.0, rectangle3.getLines()[2].getFirstPoint().getY());

        assertEquals(-2.0, rectangle3.getLines()[2].getSecondPoint().getX()); //third line, second point (bottom left)
        assertEquals(-1.0, rectangle3.getLines()[2].getSecondPoint().getY());

        assertEquals(-2.0, rectangle3.getLines()[3].getFirstPoint().getX()); //fourth line, first point (bottom left)
        assertEquals(-1.0, rectangle3.getLines()[3].getFirstPoint().getY());

        assertEquals(-2.0, rectangle3.getLines()[3].getSecondPoint().getX()); //fourth line, second point (top left)
        assertEquals(1.0, rectangle3.getLines()[3].getSecondPoint().getY());
    }

    @Test
    void rotate(){
        Rectangle rectangle4 = new Rectangle(new Point(0, 0), 4, 2);

        rectangle4.rotate(Math.PI/2); //rotate 90˚ counterclockwise

        assertEquals(-1, rectangle4.getPoints()[0].getX(), 0.001); //top left is rotated to bottom left
        assertEquals(-2, rectangle4.getPoints()[0].getY(), 0.001);

        assertEquals(-1, rectangle4.getPoints()[1].getX(), 0.001); //top right is rotated to top left
        assertEquals(2, rectangle4.getPoints()[1].getY(), 0.001);

        assertEquals(1, rectangle4.getPoints()[2].getX(), 0.001); //bottom right is rotated to top right
        assertEquals(2, rectangle4.getPoints()[2].getY(), 0.001);

        assertEquals(1, rectangle4.getPoints()[3].getX(), 0.001); //bottom left is rotated to bottom right
        assertEquals(-2, rectangle4.getPoints()[3].getY(), 0.001);
    }
}