package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void incorrectFactorial() {
        new Fact().calc(-5);
    }

    @Test
    public void correctFactorial() {
        int expected = new Fact().calc(5);
        assertThat(expected, is(120));
    }
}
