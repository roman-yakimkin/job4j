package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30UsingWhile() {
        Counter counter = new Counter();
        int result = counter.addUsingWhile(1, 10);
        assertThat(result, is(30));
    }

    @Test
    public void whenSumEvenNumbersFrom1To10Then30UsingFor() {
        Counter counter = new Counter();
        int result = counter.addUsingWhile(1, 10);
        assertThat(result, is(30));
    }

    @Test
    public void whenStartIsEqualToFinishAndOddUsingFor() {
        Counter counter = new Counter();
        int result = counter.addUsingWhile(1, 1);
        assertThat(result, is(0));
    }

    @Test
    public void whenStartAndFinishIs10UsingFor() {
        Counter counter = new Counter();
        int result = counter.addUsingWhile(10, 10);
        assertThat(result, is(10));
    }
}
