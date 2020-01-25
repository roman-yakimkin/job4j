package ru.job4j.inheritance;

/**
 * Класс - текстовый отчет
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 25.01.2020
 * @version 1.0
 */
public class TextReport {

    /**
     * Генерация отчета
     * @param name - заголовок отчета
     * @param body - содержимое отчета
     * @return сгенерированный отчет
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
