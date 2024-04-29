import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAreaOfRectangle {

    @Test
    public void testAreaPositiveValues() {

        Rectangle rectangle = new Rectangle(4,5);

        assertEquals(20, rectangle.calculateArea());
    }

    @Test
    public void testAreaForNegativeLength(){
        Rectangle rectangle = new Rectangle(-4, 5);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    public void testAreaForNegativeWidth(){
        Rectangle rectangle = new Rectangle(4, -5);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    public void testAreaForNegativeLengthAndWidth(){
        Rectangle rectangle = new Rectangle(-4, -5);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    public void testAreaForZeroLength(){
        Rectangle rectangle = new Rectangle(0, 5);
        assertEquals(0, rectangle.calculateArea());
    }

    @Test
    public void testAreaForZeroWidth(){
        Rectangle rectangle = new Rectangle(4, 0);
        assertEquals(0, rectangle.calculateArea());
    }

    @Test
    public void testAreasForDecimalValues(){
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(20.0, rectangle.calculateArea());
    }
}
