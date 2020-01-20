package ru.job4.oop;

/**
 * Класс для демонстрации проигрывания разных мелодий
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.01.2020
 * @version 1.0
 */
public class Jukebox {

    /**
     * Исполнение той или иной песни
     * @param position - ко исполняемой песни
     */
    public void music(int position){
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2){
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
        jukebox.music(10);
    }
}
