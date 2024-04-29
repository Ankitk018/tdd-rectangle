import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
