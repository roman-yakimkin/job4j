package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
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
}
