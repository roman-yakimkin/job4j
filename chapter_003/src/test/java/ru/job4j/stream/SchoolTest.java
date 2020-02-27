package ru.job4j.stream;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void testForA() {
        List<Student> students = List.of(
                new Student("Ivanov", 90),
                new Student("Petrov", 75),
                new Student("Smirnov", 20),
                new Student("Sidorov", 50),
                new Student("Sergeev", 70)
        );
        School school = new School();
        List<Student> result = school.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = List.of(
                new Student("Ivanov", 90),
                new Student("Petrov", 75),
                new Student("Sergeev", 70)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void testForB() {
        List<Student> students = List.of(
                new Student("Ivanov", 90),
                new Student("Petrov", 75),
                new Student("Smirnov", 20),
                new Student("Sidorov", 50),
                new Student("Sergeev", 70)
        );
        School school = new School();
        List<Student> result = school.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = List.of(
                new Student("Sidorov", 50)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void testForC() {
        List<Student> students = List.of(
                new Student("Ivanov", 90),
                new Student("Petrov", 75),
                new Student("Smirnov", 20),
                new Student("Sidorov", 50),
                new Student("Sergeev", 70)
        );
        School school = new School();
        List<Student> result = school.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expected = List.of(
                new Student("Smirnov", 20)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void testToMap() {
        List<Student> students = List.of(
                new Student("Ivanov", 90),
                new Student("Petrov", 75),
                new Student("Smirnov", 20),
                new Student("Sidorov", 50),
                new Student("Sergeev", 70)
        );
        School school = new School();

        Map<String, Student> result = school.convertToMap(students);
        Map<String, Student> expected = Map.of(
                "Ivanov", new Student("Ivanov", 90),
                "Petrov", new Student("Petrov", 75),
                "Smirnov", new Student("Smirnov", 20),
                "Sidorov", new Student("Sidorov", 50),
                "Sergeev", new Student("Sergeev", 70)
        );

        assertThat(result, is(expected));
    }
}
