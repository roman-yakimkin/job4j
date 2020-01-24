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
    protected String name;

    /**
     * Адрес
     */
    protected String address;

    /**
     * Описание
     */
    protected Strind description;

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

    public Strind getDescription() {
        return description;
    }

    public void setDescription(Strind description) {
        this.description = description;
    }

}
