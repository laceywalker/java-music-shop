package Instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XylophoneTest {

    Xylophone xylophone;

    @Before
    public void before(){
        xylophone = new Xylophone("ice", "magenta", "Wind For Days", true);
    }

    @Test
    public void hasMallets(){
        assertEquals(true, xylophone.getMallets());
    }

    @Test
    public void canPlay(){
        assertEquals("ding dong bang bong", xylophone.play());
    }
}
