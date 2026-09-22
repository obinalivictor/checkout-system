import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutTest {
    @Test
    public void TestThatCartIsEmpty(){
       CheckOut checkOut = new CheckOut();

       assertEquals(0,checkOut.cart());
    }
    @Test
    public void
}
