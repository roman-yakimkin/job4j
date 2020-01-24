package ru.job4j.inheritance;

/**
 * Класс - инженер
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.04.2020
 * @version 1.0
 */
public class Engineer extends Profession {

    /**
     * Технологии, кототыми владеет инженер
     */
    Technology[] technologies;

    /**
     * Изучить технологию
     * @param technology - технология
     */
    void learnTechnology(Technology technology) {

    }

    /**
     * Владеет ли инженер данной технологией
     * @param technology - технология
     * @return - истина, если владеет
     */
    boolean isOwnTechnology(Technology technology) {

    }
}
