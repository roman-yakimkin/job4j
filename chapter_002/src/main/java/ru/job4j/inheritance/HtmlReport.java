package ru.job4j.inheritance;

/**
 * Отчет в формате html
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 25.01.2020
 * @version 1.0
 */
public class HtmlReport extends TextReport {

    /**
     * Генерация отчета в формате HTML
     * @param name - заголовок отчета
     * @param body - содержимое отчета
     * @return сгенерированный в формате html отчет
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}
