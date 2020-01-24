package ru.job4j.inheritance;

/**
 * Класс, представляющий пациента
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class Patient {

    /**
     * Имя пациента
     */
    private string name;

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }
}
