package Instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("glass", "green", "Yamaha", 100);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("glass", drums.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("green", drums.getColor());
    }

    @Test
    public void canGetModel(){
        assertEquals("Yamaha", drums.getModel());
    }

    @Test
    public void canGetLoudness(){
        assertEquals(100, drums.getLoudness());
    }

    @Test
    public void canPlay(){
        assertEquals("bang bang bang", drums.play());
    }

}
