package ru.job4j.oop;

/**
 * Класс, демонстрирующий динамическое приведение типов
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 31.01.2020
 * @version 1.0
 */
public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object oCar = new Car();
        Car carFromObject = (Car) oCar;

    }
}
