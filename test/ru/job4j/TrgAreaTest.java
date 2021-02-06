package ru.job4j;

import org.junit.Assert;
import org.junit.Test;


public class TrgAreaTest {

    @Test
    public void areaTest() {
        double expected = 1.73;
        double out = TrgArea.area(2, 2, 2);
        Assert.assertEquals(expected, out,0.01);
    }
}