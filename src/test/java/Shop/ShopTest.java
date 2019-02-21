package Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumsticks;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Shop");
        drumsticks = new DrumSticks(10, 5, "nice quality");
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


}
