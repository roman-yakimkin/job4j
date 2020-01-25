package ru.job4j.inheritance;

/**
 * Класс - здание
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class Building {

    /**
     * Название
     */
    private String name;

    /**
     * Адрес
     */
    private String address;

    /**
     * Описание
     */
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
