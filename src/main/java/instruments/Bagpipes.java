package instruments;

import actions.IPlay;
import actions.ISell;

public class Bagpipes extends Instrument implements IPlay, ISell {

    public Bagpipes(double buyPrice, double sellPrice, int stockId, double markup, Brand brand, Colour colour, Material material, Type type, String sound) {
        super(buyPrice, sellPrice, stockId, markup, brand, colour, material, type, sound);
    }
}