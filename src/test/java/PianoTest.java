import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(2000, 3500,2343,1500, Brand.STEINWAY, Colour.BLACK, Material.WOOD, Type.STRING, "Bliangggg", "Grand Piano");
    }

    @Test
    public void hasStockId(){
        assertEquals(2343, piano.getStockId());
    }

    @Test
    public void hasSound() {assertEquals("Bliangggg", piano.getSound());
    }

    @Test
    public void hasSubType(){
        assertEquals("Grand Piano", piano.getSubType());
    }

    @Test
    public void hasMarkup() {
        assertEquals(1500, piano.getMarkup(), 0.0);
    }
}
