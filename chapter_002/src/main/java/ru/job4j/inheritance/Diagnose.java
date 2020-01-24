package ru.job4j.inheritance;

/**
 * Класс, представляющий диагноз
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class Diagnose {

    /**
     * Название диагноза
     */
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
