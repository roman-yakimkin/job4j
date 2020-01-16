package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = findLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas15ThenMinus1() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {3, 12, 1, 14, 20, 6};
        int value = 15;
        int result = findLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas20Then4() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {3, 12, 1, 14, 20, 6};
        int value = 20;
        int result = findLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}
