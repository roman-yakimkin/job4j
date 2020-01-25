package ru.job4j.inheritance;

/**
 * Отчет в формате JSON
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 25.01.2020
 * @version 1.0
 */
public class JSONReport extends TextReport {

    /**
     * Генерация отчета в формате JSON
     * @param name - заголовок отчета
     * @param body - содержимое отчета
     * @return - сгенерированный отчет
     */
    @Override
    public String generate(String name, String body) {
        return "{ " + System.lineSeparator()
                + " name: " + name + "," + System.lineSeparator()
                + " body: " + body + System.lineSeparator()
                + "}";

    }
}
