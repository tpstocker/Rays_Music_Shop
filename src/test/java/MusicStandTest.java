import accoutrements.MusicStand;
import instruments.Brand;
import instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    MusicStand musicStand;

    @Before
    public void before(){
        musicStand = new MusicStand(5, 7.5, 7645,2.5, Material.METAL, Brand.CASIO, "folding");
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.METAL, musicStand.getMaterial());
    }

    @Test
    public void hasSubType(){
        assertEquals("folding", musicStand.getSubType());
    }



}
