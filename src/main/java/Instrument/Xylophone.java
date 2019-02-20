package Instrument;

public class Xylophone extends Instrument {

    private boolean malletsIncluded;

    public Xylophone(String material, String color, String model, boolean malletsIncluded) {
        super(material, color, model);
        this.malletsIncluded = malletsIncluded;
    }

    public boolean getMallets() {
        return malletsIncluded;
    }
}
