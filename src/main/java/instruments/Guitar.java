package instruments;

import actions.IPlay;
import actions.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int stringNumber;
    private String subType;

    public Guitar(double buyPrice, double sellPrice, int stockId, double markup, Brand brand, Colour colour, Material material, Type type, String sound, int stringNumber, String subType) {
        super(buyPrice, sellPrice, stockId, markup, brand, colour, material, type, sound);
        this.stringNumber = stringNumber;
        this.subType = subType;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public String getSubType() {
        return subType;
    }
}