package ru.job4j.lambda;

/**
 * Класс - приложение
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 21.02.2020
 * @version 1.0
 */
public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        /**
         * Название
         */
        this.name = name;
        /**
         * Размер
         */
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Attachment{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}
