import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTest {

    @Test
    void getSidelength() {
        EquilateralTriangle et = new EquilateralTriangle(new Point(0, 0), 3);
        assertEquals(3, et.getSidelength());
    }

    @Test
    void getNumSides() {
        EquilateralTriangle et = new EquilateralTriangle(new Point(0, 0), 3);
        assertEquals(3, et.getNumSides());
    }

    @Test
    void setSidelength() {
        EquilateralTriangle et = new EquilateralTriangle(new Point(0, 0), 3);
        et.setSidelength(5);
        assertEquals(5, et.getSidelength());
    }
}