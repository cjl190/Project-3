import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    public void testLineConstructor() {
        Line line = new Line(0.0, 0.0, 5.0, 5.0);
        assertEquals(0.0, line.getFirstPoint().getX(), 0.0001);
        assertEquals(5.0, line.getSecondPoint().getX(), 0.0001);

        Point p1 = line.getFirstPoint();
        Point p2 = line.getSecondPoint();
        Line line2 = new Line(p1, p2);
        assertEquals(0.0, line.getFirstPoint().getX(), 0.0001);
        assertEquals(5.0, line.getSecondPoint().getX(), 0.0001);
    }

    @Test
    void setFirstPoint() {
        Line line = new Line(0.0, 0.0, 5.0, 5.0);
        Point newFirst = new Point(2.0, 3.0);
        line.setFirstPoint(newFirst);
        assertEquals(2.0, line.getFirstPoint().getX(), 0.0001);
        assertEquals(3.0, line.getFirstPoint().getY(), 0.0001);
    }

    @Test
    void setSecondPoint() {
        Line line = new Line(0.0, 0.0, 5.0, 5.0);
        Point newSecond = new Point(7.0, 8.0);
        line.setSecondPoint(newSecond);
        assertEquals(7.0, line.getSecondPoint().getX(), 0.0001);
        assertEquals(8.0, line.getSecondPoint().getY(), 0.0001);
    }

    @Test
    void getLines() {
        Line line = new Line(0.0, 0.0, 5.0, 5.0);
        Line[] lines = new Line[] {line};
        assertEquals(lines[0], line.getLines()[0]);
    }
}