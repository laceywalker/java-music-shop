package Instrument;


public class Piano extends Instrument implements IPlay  {

    private int numberOfLegs;


    public Piano(String material, String color, String model, int numberOfLegs) {
        super(material, color, model);
        this.numberOfLegs = numberOfLegs;
    }



    public String getMaterial() {
        return this.material;
    }


    public String getColor() {
        return this.color;
    }


    public String getModel() {
        return this.model;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    @Override
    public String play() {
        return "note note note...keys making notes";
    }
}
