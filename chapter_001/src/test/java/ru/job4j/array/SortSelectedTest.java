package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort(){
        int[] input = {3, 4, 1, 6, 2, 7, 9, 8, 0, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortOfEqualElements(){
        int[] input = {2, 1, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] result = SortSelected.sort(input);
        int[] expected = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2};
        assertThat(result, is(expected));
    }
}
