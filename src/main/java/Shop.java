import actions.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> saleItems;

    public Shop() {
        saleItems = new ArrayList<ISell>();
    }

    public void addItem(ISell item){
        this.saleItems.add(item);
    }

    public int getItemCount(){
        return this.saleItems.size();
    }

    public void removeItem(ISell item){
        this.saleItems.remove(item);
    }


}
