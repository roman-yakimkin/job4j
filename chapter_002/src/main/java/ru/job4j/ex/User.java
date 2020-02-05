package ru.job4j.ex;

/**
 * Класс - пользователь
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 05.02.2020
 * @version 1.0
 */
public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}
