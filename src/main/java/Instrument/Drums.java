package Instrument;

public class Drums extends Instrument implements IPlay {

    private int loudness;

    public Drums(String material, String color, String model, int loudness) {
        super(material, color, model);
        this.loudness = loudness;
    }

    public int getLoudness() {
        return loudness;
    }

    @Override
    public String play(){
        return "bang bang bang";
    }

}
