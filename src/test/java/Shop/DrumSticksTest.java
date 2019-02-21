package Shop;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumsticks;

    @Before
    public void before(){
        drumsticks = new DrumSticks(4.50, 10.50, "classic sticks for quality drumming");
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(4.50, drumsticks.getPriceBought(), 0.01);
    }

    @Test
    public void canGetPriceSold(){
        assertEquals(10.50, drumsticks.getPriceSold(), 0.01);
    }

    @Test
    public void canGetDescription(){
        assertEquals("classic sticks for quality drumming", drumsticks.getDescription());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(6.00, drumsticks.calculateMarkup(), 0.01);
    }
}
