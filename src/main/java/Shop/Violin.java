package Shop;

import Instrument.IPlay;
import Instrument.Instrument;

public class Violin extends Instrument implements ISell, IPlay {

    private double priceBought;
    private double priceSold;
    private String description;

    public Violin(String material, String color, String model, double priceBought, double priceSold, String description) {
        super(material, color, model);
        this.priceBought = priceBought;
        this.priceSold = priceSold;
        this.description = description;
    }

    @Override
    public String play() {
        return "serenading you with tunes";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }

    @Override
    public double getPriceBought() {
        return priceBought;
    }

    @Override
    public double getPriceSold() {
        return priceSold;
    }

    public String getDescription() {
        return description;
    }
}
