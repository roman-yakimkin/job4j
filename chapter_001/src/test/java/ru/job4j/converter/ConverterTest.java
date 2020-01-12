package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 240;
        int expected = 4;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void euroToRuble() {
        int in = 6;
        int expected = 420;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void dollarToRuble() {
        int in = 12;
        int expected = 720;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(out, expected);
    }
}
