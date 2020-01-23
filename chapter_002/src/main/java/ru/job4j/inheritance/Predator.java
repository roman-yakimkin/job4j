package ru.job4j.inheritance;

/**
 * Класс, предстввляющий хищное животное
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 23.01.2020
 * @version 1.0
 */
public class Predator extends Animal {

    /**
     * Конструктор
     */
    public Predator() {
        super();
        System.out.println("Predator has been created");
    }
}
