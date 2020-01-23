package ru.job4j.oop;

/**
 * Класс, представляющий сосуд
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.01.2020
 * @version 1.0
 */
public class Jar {

    /**
     * Количество воды в сосуде
     */
    public int value;

    /**
     * Конструктор сосуда
     * @param size - количество воды
     */
    public Jar(int size) {
        this.value = size;
    }

    /**
     * Перелить с сосуд содержимое другого сосуда
     * @param another - другой сосуд
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
