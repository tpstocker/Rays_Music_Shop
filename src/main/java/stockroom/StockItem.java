package stockroom;

import actions.ISell;

public class StockItem implements ISell {

    private double buyPrice;
    private double sellPrice;
    private int stockId;
    private double markup;

    public StockItem(double buyPrice, double sellPrice, int stockId, double markup) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.stockId = stockId;
        this.markup = markup;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getStockId() {
        return stockId;
    }

    @Override
    public double getMarkup() {
        markup = sellPrice - buyPrice;
        return markup;
    }
}