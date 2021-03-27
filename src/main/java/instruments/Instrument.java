package instruments;

import actions.IPlay;
import actions.ISell;
import stockroom.StockItem;

public abstract class Instrument extends StockItem implements IPlay, ISell {


    private Brand brand;
    private Colour colour;
    private Material material;
    private Type type;
    private String sound;


    public Instrument(double buyPrice, double sellPrice, int stockId, double markup, Brand brand, Colour colour, Material material, Type type, String sound) {
        super(buyPrice, sellPrice, stockId, markup);
        this.brand = brand;
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.sound = sound;
    }

    public Brand getBrand() {
        return brand;
    }

    public Colour getColour() {
        return colour;
    }

    public Material getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String getSound() {
        return sound;
    }
}



