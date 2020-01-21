package ru.job4.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BatteryTest {

    @Test
    public void OneIsFiveAndAnotherIsTen() {
        Battery one = new Battery(5);
        Battery another = new Battery(10);
        one.exchange(another);
        assertThat(one.getLoad(), is(0));
        assertThat(another.getLoad(), is(15));
    }
}
