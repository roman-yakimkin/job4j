package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        Point a = new Point(0, 0);
        Point b = new Point(10, 0);
        double expected = 10;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        Point a = new Point(1, 2);
        Point b = new Point(10, 4);
        double expected = Math.sqrt(85);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 4);
        double expected = Math.sqrt(6);
        double out = a.distance(b);
        Assert.assertNotEquals(expected, out, 0.01);
    }
}
