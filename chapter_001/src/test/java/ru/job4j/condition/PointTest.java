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

    @Test
    public void distance3D1() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = Math.sqrt(3);
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3D2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0.0;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3D3() {
        Point a = new Point(10, 10, 10);
        Point b = new Point(20, 10, 10);
        double expected = 10.0;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }


}
