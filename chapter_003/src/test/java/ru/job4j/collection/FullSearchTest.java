package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = List.of(
                new Task("1", "First desc"),
                new Task("2", "Second desk"),
                new Task("3", "Third desc"),
                new Task("1", "First desc")
        );

        Set<String> expected = new HashSet<String>(Arrays.asList("1", "2", "3"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}
