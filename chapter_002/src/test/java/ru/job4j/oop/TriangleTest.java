package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExists() {
        boolean result = Triangle.exists(3, 3, 5);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.exists(6, 6, 15);
        assertThat(result, is(false));
    }

    @Test
    public void areaIsSix() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(4, 0), new Point(4, 3));
        double area = triangle.area();
        double expected = 6.0;
        assertEquals(area, expected, 0.01);
    }

    @Test
    public void areaIsHalf() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1));
        double area = triangle.area();
        double expected = 0.5;
        assertEquals(area, expected, 0.01);
    }
}
