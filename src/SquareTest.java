import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SquareTest {

    @Test
    void setWidth() {
        Square square = new Square(new Point(0,0), 4);
        assertEquals(4, square.getWidth());
        assertEquals(4, square.getHeight());
        square.setWidth(1);
        assertEquals(1, square.getWidth());
        assertEquals(1, square.getHeight());
    }

    @Test
    void setHeight() {
        Square square2 = new Square(new Point(0,0), 4);
        assertEquals(4, square2.getHeight());
        assertEquals(4, square2.getWidth());
        square2.setHeight(1);

        assertEquals(1, square2.getHeight());
        assertEquals(1, square2.getWidth());
    }
}