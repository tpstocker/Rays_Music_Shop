package instruments;

import actions.IPlay;
import actions.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String subType;

    public Piano(double buyPrice, double sellPrice, int stockId, double markup, Brand brand, Colour colour, Material material, Type type, String sound, String subType) {
        super(buyPrice, sellPrice, stockId, markup, brand, colour, material, type, sound);
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }
}
