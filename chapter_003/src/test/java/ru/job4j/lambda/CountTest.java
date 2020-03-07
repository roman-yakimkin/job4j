package ru.job4j.lambda;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountTest {

    @Test
    public void countTest() {
        List<Integer> numbers = List.of(1, 2, 3, 2, 1, 2);
        Map<Integer, Long> result = Count.count(numbers);
        Map<Integer, Long> expected = Map.of(
                1, 2L,
                2, 3L,
                3, 1L
        );
        assertThat(result, is(expected));
    }
}
