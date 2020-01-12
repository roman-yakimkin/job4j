package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1(){
        int perimeter = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2(){
        int perimeter = 14;
        int k = 3;
        double expected = 7.0/4.0 * 21.0/4.0;
        double out = SqArea.square(perimeter, k);

        System.out.println(expected + "   " + out);
        Assert.assertEquals(expected, out, 0.01);
    }

}
