package ru.job4j.strategy;

/**
 * Класс - треугольник
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 01.02.2020
 * @version 1.0
 */
public class Triangle implements Shape {

    /**
     * Отображение фигуры
     * @return фигура в виде строки
     */
    @Override
    public String draw() {
        return (new StringBuilder()
                .append("+")
                .append("++")
                .append("+ +")
                .append("+  +")
                .append("+ +")
                .append("++")
                .append("+")
                .toString());
    }
}
