package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Группировка студентов по секциям
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Group {

    static class Holder {
        String key, value;

        public Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * Группировка студентов по секциям
     * @param students - список студентов
     * @return - сгруппированный список студентов по секциям
     */
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap((student) -> student.getUnits().stream().map(
                        (unit) -> new Holder(unit, student.getName())
                        )
                )
                .collect(
                        Collectors.groupingBy(t -> t.key,
                                Collector.of(
                                        HashSet::new,
                                        (set, el) -> {
                                            set.add(el.value);
                                        },
                                        (left, right) -> {
                                            left.addAll(right);
                                            return left;
                                        }
                                )
                ));
    }
}
