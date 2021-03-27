import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagpipesTest {

    Bagpipes bagpipes;

    @Before
    public void before(){
        bagpipes = new Bagpipes(500, 900, 2345,400, Brand.HARDBLOW, Colour.DARK_BROWN, Material.WOOD, Type.WOODWIND, "ARGHHHHH");
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(500, bagpipes.getBuyPrice(), 0.0);
    }

    @Test
    public void hasBrand() {
        assertEquals(Brand.HARDBLOW, bagpipes.getBrand());
    }

    @Test
    public void hasSound() {
        assertEquals("ARGHHHHH", bagpipes.getSound());
    }

    @Test
    public void hasMarkup() {
        assertEquals(400, bagpipes.getMarkup(), 0.0);
    }
}