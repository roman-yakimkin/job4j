package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax(){
        int result = SqMax.max(10,2,3,5);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax(){
        int result = SqMax.max(1,22,3,5);
        assertThat(result, is(22));
    }

    @Test
    public void whenThirdMax(){
        int result = SqMax.max(2,2,43,5);
        assertThat(result, is(43));
    }

    @Test
    public void whenFourthMax(){
        int result = SqMax.max(1,2,3,15);
        assertThat(result, is(15));
    }

    @Test
    public void whenAllEqual(){
        int result = SqMax.max(10,10,10,10);
        assertThat(result, is(10));
    }

}
