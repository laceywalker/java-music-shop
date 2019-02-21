package Instrument;

public abstract class Instrument  {

    protected String material;
    protected String color;
    protected String model;

    public Instrument(String material, String color, String model){
        this.material = material;
        this.color = color;
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }


}
