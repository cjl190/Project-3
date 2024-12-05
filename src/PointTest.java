import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PointTest {

    @Test
    void getX() {
        Point p = new Point(0.0, 0.0);
        p.setX(5.0);
        assertEquals(5.0, p.getX(), 0.0001);
    }

    @Test
    void getY() {
        Point p = new Point(0.0, 0.0);
        p.setY(10.0);
        assertEquals(10.0, p.getY(), 0.0001);
    }

    @Test
    void setX() {
        Point p = new Point(0.0, 0.0);
        p.setX(5.0);
        assertEquals(5.0, p.getX(), 0.0001);
    }

    @Test
    void setY() {
        Point p = new Point(0.0, 0.0);
        p.setY(10.0);
        assertEquals(10.0, p.getY(), 0.0001);
    }

    @Test
    void rotateAbout() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        p1.rotateAbout(p2, Math.PI);
        assertEquals(5, p1.getX());
        }

}