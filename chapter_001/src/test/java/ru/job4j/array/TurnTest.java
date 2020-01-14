package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenOddCountOfElements(){
        Turn turn = new Turn();
        int[] input = {1, 2, 3, 4, 5};
        int[] result = turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotOddCountOfElements(){
        Turn turn = new Turn();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneElement(){
        Turn turn = new Turn();
        int[] input = {2};
        int[] result = turn.back(input);
        int[] expected = {2};
        assertThat(result, is(expected));
    }

}
