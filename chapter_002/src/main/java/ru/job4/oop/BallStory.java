package ru.job4.oop;

/**
 * Класс, представляющий сказку про Колобка
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.01.2020
 * @version 1.0
 */
public class BallStory {

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
