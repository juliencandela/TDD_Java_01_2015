import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
    }

}