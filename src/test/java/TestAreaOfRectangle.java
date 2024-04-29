import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAreaOfRectangle {

    // both the numbers are positive
    //one value is negative
    //both are negative
    //zeros
    @Test
    public void testAreaPositiveValues() {
        //assign
        Rectangle rectangle = new Rectangle();
        //act //assert
        assertEquals(20, rectangle.calculateArea(4,5));
    }

    @Test
    public void testAreaForNegativeLength(){
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea(-4, 5));
    }

    @Test
    public void testAreaForNegativeWidth(){
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea(4, -5));
    }

    @Test
    public void testAreaForNegativeLengthAndWidth(){
        Rectangle rectangle = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea(-4, -5));
    }

    @Test
    public void testAreaForZeroLength(){
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.calculateArea(0, 5));
    }

    @Test
    public void testAreaForZeroWidth(){
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.calculateArea(4, 0));
    }
}
