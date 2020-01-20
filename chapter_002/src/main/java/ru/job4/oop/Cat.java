package ru.job4.oop;

/**
 * Учебный класс, представляющий кошку
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 19.01.2020
 * @version 1.0
 */
public class Cat {

    /**
     * Произнесение звука животным
     * @return voice - произносимый звук
     */
    public String sound() {
        String voice = "may - may";
        return voice;
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();

        String say = peppy.sound();
        System.out.println("Peppy says: " + say);
    }
}
