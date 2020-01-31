package ru.job4j.oop;

/**
 * Класс, представляющий студента
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 19.01.2020
 * @version 1.0
 */
public class StudentInfo {

    /**
     * Проигрыш музыки
     * @param lyrics - проигрываемая музыка
     */
    public void music(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    /**
     * Исполнение песни
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        StudentInfo petya = new StudentInfo();
        String song = "I believe I can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.song();
        petya.song();
        petya.song();
    }
}
