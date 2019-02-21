package Shop;

public class DrumSticks implements ISell {

    double priceBought;
    double priceSold;
    String description;

    public DrumSticks(double priceBought, double priceSold, String description) {
        this.priceBought = priceBought;
        this.priceSold = priceSold;
        this.description = description;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double calculateMarkup(){
        return this.priceSold - this.priceBought;
    }

}
