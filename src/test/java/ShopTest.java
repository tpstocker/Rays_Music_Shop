import accoutrements.*;
import instruments.*;
import org.junit.Before;
import org.junit.Test;
import stockroom.StockItem;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    StockItem stockItem;
    SheetMusic sheetMusic;
    GuitarString guitarString;
    Bagpipes bagpipes;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        sheetMusic = new SheetMusic(5, 10, 6657, 5, Material.DIGITAL);
        guitarString = new GuitarString(1,8,9878,7,Material.NYLON, Brand.STEINWAY, 10);
        bagpipes = new Bagpipes(400, 850, 5433, 450, Brand.WINDYBAGZ, Colour.LIGHT_BROWN, Material.WOOD, Type.WOODWIND, "BLEURGHHH");
    }

    @Test
    public void canAddItem() {
        shop.addItem(sheetMusic);
        assertEquals(1, shop.getItemCount());
    }

    @Test
    public void canRemoveItem() {
        shop.removeItem(bagpipes);
        assertEquals(0, shop.getItemCount());
    }
}


