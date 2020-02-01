package ru.job4j.strategy;

/**
 * Класс - рисование фигуры
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 01.02.2020
 */
public class Paint {

    /**
     * Рисование фигуры
     * @param shape - отображаемая фигура
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
