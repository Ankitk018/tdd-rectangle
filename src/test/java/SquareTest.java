import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {


    @Test
    public void shouldReturnArea16OfSquareOfSide4(){

        Square square = new Square(4);
        assertEquals(16, square.area());
    }
}
