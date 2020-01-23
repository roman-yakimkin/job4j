package ru.job4j.condition;

/**
 * Класс, представляющий точку
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 3.0
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
     *  Координата z точки
     */
    private int z;

    /**
     * Конструктор точки для двух координат
     * @param first - координата X
     * @param second - координата Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор точки для трех координат
     * @param first
     * @param second
     * @param third
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * Вычислить расстояние между двумя точками
     * @param that - вторая точка
     * @return - расстояние между двумя точками
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Вычислить трехмерное расстояние между двумя точками
     * @param that - вторая точка
     * @return - расстояние между двумя точками в трехмерном пространстве
     */
    public double distance3D(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double dist = a.distance3D(b);
        System.out.println(dist);
    }
}
