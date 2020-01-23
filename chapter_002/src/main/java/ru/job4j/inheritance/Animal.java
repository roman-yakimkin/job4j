package ru.job4j.inheritance;

/**
 * Класс, представляющий животное
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 23.01.2020
 * @version 1.0
 */
public class Animal {

    /**
     * имя животного
     */
    protected String name;

    /**
     * Конструктор
     */
    public Animal() {
        super();
        System.out.println("Animal has been created");
    }

    /**
     * Конструктор
     * @param name имя животного
     */
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal " + this.name + " has been created");
    }
}
