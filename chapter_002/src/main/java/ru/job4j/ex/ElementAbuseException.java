package ru.job4j.ex;

/**
 * Исключение, когда найденное слово попадает в запрещенный список
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 05.02.2020
 * @version 1.0
 */
public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String message) {
        super(message);
    }
}
