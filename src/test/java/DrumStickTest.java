import accoutrements.DrumStick;
import instruments.Brand;
import instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick(0.5, 2,9876, 1.5, Material.WOOD, Brand.TRUMPS, 1);
    }

    @Test
    public void hasPackSize() {
        assertEquals(1, drumStick.getPackSize());
    }

    @Test
    public void hasMarkup() {
        assertEquals(1.5, drumStick.getMarkup(), 0.0);
    }
}
