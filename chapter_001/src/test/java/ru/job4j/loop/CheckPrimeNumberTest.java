package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when3() {
        boolean rsl = CheckPrimeNumber.check(3);
        assertThat(rsl, is(true));
    }

    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when9() {
        boolean rsl = CheckPrimeNumber.check(9);
        assertThat(rsl, is(false));
    }

    @Test
    public void when100() {
        boolean rsl = CheckPrimeNumber.check(100);
        assertThat(rsl, is(false));
    }

    @Test
    public void when7351() {
        boolean rsl = CheckPrimeNumber.check(7351);
        assertThat(rsl, is(true));
    }

    @Test
    public void when7352() {
        boolean rsl = CheckPrimeNumber.check(7352);
        assertThat(rsl, is(false));
    }
}
