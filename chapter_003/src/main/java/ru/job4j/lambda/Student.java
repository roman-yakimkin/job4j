package ru.job4j.lambda;

import java.util.Set;

/**
 * Класс - студент
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Student {
    /**
     * Имя студента
     */
    private String name;
    /**
     * Список посещаемых секций
     */
    private Set<String> units;

    public Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public Set<String> getUnits() {
        return units;
    }
}
