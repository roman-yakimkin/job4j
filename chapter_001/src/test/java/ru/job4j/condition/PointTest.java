package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        int x1 = 0, y1 = 0, x2 = 10, y2 = 0;
        double expected = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int x1 = 1, y1 = 2, x2 = 10, y2 = 4;
        double expected = Math.sqrt(85);
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        int x1 = 1, y1 = 2, x2 = 2, y2 = 4;
        double expected = Math.sqrt(6);
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertNotEquals(expected, out, 0.01);
    }
}
