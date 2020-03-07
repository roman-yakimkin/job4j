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
                1, (long) 2,
                2, (long) 3,
                3, (long) 1
        );
        assertThat(result, is(expected));
    }
}
