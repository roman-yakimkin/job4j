package ru.job4j.pojo;

/**
 * Класс - книга
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 26.01.2020
 * @version 1.0
 */
public class Book {

    /**
     * Название книги
     */
    private String name;

    /**
     * Количество страниц книги
     */
    private int pagesCount;

    public Book(String name, int pagesCount) {
        this.name = name;
        this.pagesCount = pagesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
}
