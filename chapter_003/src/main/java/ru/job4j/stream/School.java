package ru.job4j.stream;

import java.util.List;
import java.util.Map;
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

    /**
     * Преобразование списка студентов в карту
     * @param students - список студентов
     * @return - карта студентов
     */
    Map<String, Student> convertToMap(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(
            e -> e.getName(), e -> e
        ));
    }
}
