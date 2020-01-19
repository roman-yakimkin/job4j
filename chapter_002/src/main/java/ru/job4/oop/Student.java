package ru.job4.oop;

/**
 * Класс, представляющий студента
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 19.01.2020
 * @version 1.0
 */
public class Student {

    /**
     * Проигрыш музыки
     */
    public void music(){
        System.out.println("Tra tra tra");
    }

    /**
     * Исполнение песни
     */
    public void song(){
        System.out.println("I believe I can fly");
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
