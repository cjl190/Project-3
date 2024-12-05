import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getCenter() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3));

        assertEquals(1, triangle.getCenter().getX());
        assertEquals(1, triangle.getCenter().getY());
    }

    @Test
    void setCenter() {
        Triangle triangle1 = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3));
        triangle1.setCenter(new Point(2, 2));

        assertEquals(2, triangle1.getCenter().getX());
        assertEquals(2, triangle1.getCenter().getY());
    }
}