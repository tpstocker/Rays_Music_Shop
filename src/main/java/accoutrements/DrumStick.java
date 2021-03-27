package accoutrements;
import actions.ISell;
import instruments.Brand;
import instruments.Material;
import stockroom.StockItem;

public class DrumStick extends StockItem implements ISell {

    private Material material;
    private Brand brand;
    private int packSize;

    public DrumStick(double buyPrice, double sellPrice, int stockId, double markup, Material material, Brand brand, int packSize) {
        super(buyPrice, sellPrice, stockId, markup);
        this.material = material;
        this.brand = brand;
        this.packSize = packSize;
    }

    public Material getMaterial() {
        return material;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getPackSize() {
        return packSize;
    }


}
