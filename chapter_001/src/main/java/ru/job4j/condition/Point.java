package ru.job4j.condition;

/**
 * Класс, представляющий точку
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 2.0
 */
public class Point {

    /**
     * Координата х точки
     */
    private int x;

    /**
     * Координата y точки
     */
    private int y;

    /**
     * Конструктор точки
     * @param first - координата X
     * @param second - координата Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Вычислить расстояние между двумя точками
     * @param that - вторая точка
     * @return - расстояние меду двумя точками
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
