import abstractclasses.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAbstractClasses {
    @Test
    public void testDogBark() {
       Animal dog = new Doggo("Dog");
       assertEquals("Bark!", dog.makeSound());
    }
}
