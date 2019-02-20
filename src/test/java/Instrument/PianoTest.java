package Instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("marble", "purple", "Classic", 5);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("marble", piano.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("purple", piano.getColor());
    }

    @Test
    public void canGetModel(){
        assertEquals("Classic", piano.getModel());
    }

    @Test
    public void canGetNumberOfLegs(){
        assertEquals(5, piano.getNumberOfLegs());
    }
}
