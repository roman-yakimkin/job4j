package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс - информация о гражданине
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class Citizen {
    /**
     * Серия и номер паспорта
     */
    private String passport;
    /**
     * ФИО гражданина
     */
    private String username;

    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Citizen)) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return Objects.equals(getPassport(), citizen.getPassport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
