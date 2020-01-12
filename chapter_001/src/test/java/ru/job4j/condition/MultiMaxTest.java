package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax(){
        MultiMax check = new MultiMax();
        int result = check.max(4,2,1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax(){
        MultiMax check = new MultiMax();
        int result = check.max(2,8,3);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdMax(){
        MultiMax check = new MultiMax();
        int result = check.max(2,2,6);
        assertThat(result, is(6));
    }

    @Test
    public void whenAllEqual(){
        MultiMax check = new MultiMax();
        int result = check.max(5,5,5);
        assertThat(result, is(5));
    }


}
