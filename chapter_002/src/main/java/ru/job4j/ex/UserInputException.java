package ru.job4j.ex;

/**
 * Пользовательское исключение
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 05.02.2020
 * @version 1.0
 */
public class UserInputException extends Exception {
    public UserInputException(String message) {
        super(message);
    }
}
