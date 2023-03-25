import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void testBinsMax()
    {
        Bins bins = new Bins(2,12);
        int expected = 12;
        int actual = bins.max;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinsMin()
    {
        Bins bins = new Bins(2,12);
        int expected = 2;
        int actual = bins.min;

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testIncrementBins()
//    {
//
//    }

//    @Test
//    public void testGetBinTotal()
//    {
//
//    }

}