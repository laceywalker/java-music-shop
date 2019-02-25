package Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumsticks;
    DrumSticks boomsticks;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Shop");
        drumsticks = new DrumSticks(10, 15, "nice quality");
        boomsticks = new DrumSticks(20, 25, "okay quality");
    }

    @Test
    public void canGetShopName(){
        assertEquals("Ray's Music Shop", shop.getName());
    }

    @Test
    public void shopStockStartsEmpty(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddToStock(){
        shop.addItemsToStock(drumsticks);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addItemsToStock(drumsticks);
        shop.removeItemsFromStock(drumsticks);
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canCalculateMarkup(){
        shop.addItemsToStock(drumsticks);
        assertEquals(5, shop.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetTotalProfit(){
        shop.addItemsToStock(drumsticks);
        shop.addItemsToStock(boomsticks);
        assertEquals(2, shop.getStock());
        assertEquals(10, shop.getTotalProfit(), 0.01);
    }

}
