import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {


    @Test
    public void shouldReturnArea16OfSquareOfSide4(){

        Square square = new Square(4);

        assertEquals(16, square.area());
    }

    @Test
    public void shouldThrowAnIllegealArgumentExceptionForNegativeValueOfSide(){

        assertThrows(IllegalArgumentException.class, () -> new Square(-4) );
    }

    @Test

    public void shouldThrowAnIllegealArgumentExceptionForZeroValueOfSide(){

        assertThrows(IllegalArgumentException.class, () -> new Square(0) );
    }
}
