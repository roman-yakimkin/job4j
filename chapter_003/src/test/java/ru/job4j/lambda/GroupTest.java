package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {

    @Test
    public void groupTest() {
        List<Student> students = List.of(
                new Student("Иванов", Set.of("Бокс", "Вольная борьба")),
                new Student("Петров", Set.of("Вольная борьба", "Тяжелая атлетика")),
                new Student("Сидоров", Set.of("Вольная борьба", "Дзюдо")),
                new Student("Смирнов", Set.of("Шахматы", "Дзюдо"))
        );

        var result = Group.sections(students);
        var expected = Map.of(
            "Бокс", Set.of("Иванов"),
            "Вольная борьба", Set.of("Иванов", "Петров", "Сидоров"),
            "Тяжелая атлетика", Set.of("Петров"),
            "Дзюдо", Set.of("Сидоров", "Смирнов"),
            "Шахматы", Set.of("Смирнов")
        );
        assertThat(result, is(expected));
    }
}
