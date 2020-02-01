package ru.job4j.strategy;

/**
 * Класс - квадрат
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 01.02.2020
 * @version 1.0
 */
public class Square implements Shape {

    /**
     * Отображение фигуры
     * @return фигура в виде строки
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++");
        pic.append("+  +");
        pic.append("+  +");
        pic.append("++++");
        return pic.toString();
    }
}
