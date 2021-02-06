package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
      //  Assert.assertEquals(expected, out, 0.01); 0.01 - (delta) используется для указания допуска погрешности между фактическим результатом out и ожидаемым результатом expected
    }
}