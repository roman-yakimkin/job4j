package ru.job4j.inheritance;

/**
 * Класс, реализующий профессию
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class Profession {
    /**
     * Имя
     */
    private String name;

    /**
     * Фамилия
     */
    private String surname;

    /**
     * Образование
     */
    private String education;

    /**
     * День рождения
     */
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
