package accoutrements;

import actions.ISell;
import instruments.Material;
import stockroom.StockItem;

public class SheetMusic extends StockItem implements ISell {

    private Material material;


    public SheetMusic(double buyPrice, double sellPrice, int stockId, double markup, Material material) {
        super(buyPrice, sellPrice, stockId, markup);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
}
