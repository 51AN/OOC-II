import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        Dollar product = five.times(1);
        five.times(2);
        assertEquals(10, five.getAmount());

        //assertEquals(new Dollar(10),new Dollar(10));
    }

    @Test
    public void testEqual(){
        //assertEquals(new Dollar(10),new Dollar(10));
        //assertEquals(new Dollar(10),new Dollar(10));


        //assertTrue(new Dollar(10).equals(new Dollar(10)));
        //assertFalse(new Dollar(10).equals(new Dollar(15)));

        assertTrue(new Franc(10).equals(new Franc(10)));
        assertFalse(new Franc(10).equals(new Franc(15)));

    }
}
