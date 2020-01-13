package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
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
