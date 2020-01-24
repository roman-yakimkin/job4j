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
    protected string name;

    /**
     * Фамилия
     */
    protected string surname;

    /**
     * Образование
     */
    protected string education;

    /**
     * День рождения
     */
    protected string birthday;

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getSurname() {
        return surname;
    }

    public void setSurname(string surname) {
        this.surname = surname;
    }

    public string getEducation() {
        return education;
    }

    public void setEducation(string education) {
        this.education = education;
    }

    public string getBirthday() {
        return birthday;
    }

    public void setBirthday(string birthday) {
        this.birthday = birthday;
    }
}
