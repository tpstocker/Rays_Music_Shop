import accoutrements.SheetMusic;
import instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(3.5, 10, 4423, 6.5, Material.PAPER);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.PAPER, sheetMusic.getMaterial());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(3.5, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void hasMarkup() {
        assertEquals(6.5, sheetMusic.getMarkup(), 0.0);
    }
}
