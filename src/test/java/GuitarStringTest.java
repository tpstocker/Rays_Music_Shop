import accoutrements.GuitarString;
import instruments.Brand;
import instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarString(1.25, 7.5, 6221,6.25, Material.NYLON, Brand.YAMAHA, 5);
    }

    @Test
    public void hasBrand() {
        assertEquals(Brand.YAMAHA, guitarStrings.getBrand());
    }

    @Test
    public void hasPackSize() {
        assertEquals(5, guitarStrings.getPackSize());
    }
}
