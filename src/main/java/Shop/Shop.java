package Shop;

import java.util.ArrayList;

public class Shop implements ISell {

    protected String name;
    protected ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock.size();
    }

    public void addItemsToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemsFromStock(ISell item){
                this.stock.remove(item);

    }

    @Override
    public double calculateMarkup(){
        double markupAmount = 0;

        for(ISell item : this.stock){
            markupAmount = item.getPriceSold() - item.getPriceBought();

        }
        return markupAmount;
    }

    @Override
    public double getPriceSold(){
        double priceSold = 0;
        for (ISell item: this.stock){
            priceSold = this.getPriceSold();
        }
        return priceSold;
    }

    @Override
    public double getPriceBought(){
        double priceBought = 0;
        for (ISell item: this.stock){
            priceBought = this.getPriceBought();
        }
        return priceBought;
    }


    public double getTotalProfit(){
        double totalProfit = 0;

        for (ISell item : this.stock){
            totalProfit += this.calculateMarkup();
        }

        return totalProfit;
    }
}
