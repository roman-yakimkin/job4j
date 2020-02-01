package ru.job4j.oop;

/**
 * Класс, представляющий треугольник
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 2.0
 */
public class Triangle {

    /**
     * Первая точка треугольника
     */
    private Point first;

    /**
     * Вторая точка треугольника
     */
    private Point second;

    /**
     * Третья точка треугольника
     */
    private Point third;

    /**
     * Конструктор треугольника
     * @param ap - первая точка
     * @param bp - вторая точка
     * @param cp - третья точка
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Вычислить периметр треугольника
     * @param a - длина первой стороны
     * @param b - длина второй стороны
     * @param c - длина третьей стороны
     * @return - периметр треугольника
     */
    public static double perimeter(double a, double b, double c) {
        return (a + b + c);
    }

    /**
     * Вычисление полщади треугольника
     * @return значение площади треугольника
     */
    public double area() {
        double area = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double semiPerimeter = perimeter(a, b, c) / 2;

        if (exists(a, b, c)) {
            area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        }

        return area;
    }

    /**
     * Проверить, может ли существовать треугольник с данными сторонами
     * @param ab - первая сторона
     * @param ac - вторая сторона
     * @param bc - третья сторона
     * @return - истина, если треугольник существует
     */
    public static boolean exists(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }
}
