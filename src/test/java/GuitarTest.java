import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(200, 550,5643, 350, Brand.ROLAND, Colour.LIGHT_BROWN, Material.WOOD, Type.STRING, "Strummmmmmzzz", 4, "Electric");
    }

    @Test
    public void hasStringNumber() {
        assertEquals(4, guitar.getStringNumber());
    }

    @Test
    public void hasSubType() {
        assertEquals("Electric", guitar.getSubType());
    }

    @Test
    public void hasSound() {assertEquals("Strummmmmmzzz", guitar.getSound());
    }
}
