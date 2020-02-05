package ru.job4j.ex;

/**
 * Исключение - неправильный пользователь
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 05.02.2020
 * @version 1.0
 */
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String msg) {
        super(msg);
    }
}
