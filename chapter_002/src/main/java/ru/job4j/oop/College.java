package ru.job4j.oop;

/**
 * Класс, представляющий колледж
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 31.01.2020
 * @version 1.0
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = (Student) freshman;
        Object object = (Object) student;
    }
}
