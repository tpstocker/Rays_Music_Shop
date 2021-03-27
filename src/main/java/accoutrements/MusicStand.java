package accoutrements;

import actions.ISell;
import instruments.Brand;
import instruments.Material;
import stockroom.StockItem;

public class MusicStand extends StockItem implements ISell {

    private Material material;
    private Brand brand;
    private String subType;


    public MusicStand(double buyPrice, double sellPrice, int stockId, double markup, Material material, Brand brand, String subType) {
        super(buyPrice, sellPrice, stockId, markup);
        this.material = material;
        this.brand = brand;
        this.subType = subType;
    }

    public Material getMaterial() {
        return material;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getSubType() {
        return subType;
    }
}
