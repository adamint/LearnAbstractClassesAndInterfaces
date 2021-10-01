import interfaceslearning.Square;
import interfaceslearning.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterfaces {
    @Test
    public void testGetArea() {
        assertEquals(4, new Square(2, 2).getArea());
        assertEquals(4, new Triangle(2, 4).getArea());
    }
}
