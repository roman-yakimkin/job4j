package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс - пользователь банка
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.02.2020
 * @version 1.0
 */
public class User {
    /**
     * Паспортные данные
     */
    private String passport;
    /**
     * ФИО пользователя
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getPassport(), user.getPassport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassport());
    }
}
