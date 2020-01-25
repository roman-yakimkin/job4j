package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс - колледж
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 25.01.2020
 * @version 1.0
 */
public class College {

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Sergey Ivanovich Petrov");
        student.setEnrollmentDate(new Date(2010,8,1));
        student.setGroup("A-100");
        System.out.println("Student " + student.getFullName() + " was enrolled into the " + student.getGroup() +  " group on " + student.getEnrollmentDate());
    }
}
