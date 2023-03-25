import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class DiceTest {

    @Test
    public void testNumSides()
    {
        Dice dice = new Dice(0,6);
        int expected = 6;
        int actual = dice.numSides;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumDice()
    {
        Dice dice = new Dice(2, 0);
        int expected = 2;
        int actual = dice.numDice;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToss()
    {
        Dice dice = new Dice(2, 6);

        int actual;

        for (int i = 0; i < 10000; i++) {
            actual = dice.toss();
            Assert.assertFalse(actual > 12);
            Assert.assertFalse(actual < 2);

        }

    }



}