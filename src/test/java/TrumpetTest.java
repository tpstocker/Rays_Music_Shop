import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(150,200, 2778, 50,Brand.YAMAHA, Colour.SILVER, Material.METAL, Type.BRASS, "DooDooDOOOO", "Bugle");
    }

    @Test
    public void hasSellPrice() {
        assertEquals(200, trumpet.getSellPrice(), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals(Colour.SILVER, trumpet.getColour());
    }

    @Test
    public void hasSubType() {
        assertEquals("Bugle", trumpet.getSubType());
    }

    @Test
    public void hasSound() {
        assertEquals("DooDooDOOOO", trumpet.getSound());
    }
}
