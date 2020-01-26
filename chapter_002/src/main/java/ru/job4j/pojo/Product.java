package ru.job4j.pojo;

/**
 * Класс, представляющий продукт
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 26.01.2020
 * @version 1.0
 */
public class Product {

    /**
     * Название продукта
     */
    private String name;

    /**
     * Количество продуктов
     */
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
