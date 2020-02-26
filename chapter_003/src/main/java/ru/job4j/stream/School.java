package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс - школа
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class School {

    /**
     * Фильтрация студентов в соответствии с функцией из предиката
     * @param students - начальный список студента
     * @param predict - интерфейс - предикат
     * @return - отсортированный список студентов
     */
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
