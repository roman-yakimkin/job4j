package ru.job4j.ex;

/**
 * Исключение "пользователь не найден"
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 05.02.2020
 * @version 1.0
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
