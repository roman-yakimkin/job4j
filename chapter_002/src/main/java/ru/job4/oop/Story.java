package ru.job4.oop;

/**
 * Класс, представляющий сказку о Пете и Красной Шапочке
 */
public class Story {

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Pioneer petr = new Pioneer();
        Girl redHat = new Girl();
        Wolf wolf = new Wolf();

        redHat.help(petr);
        wolf.eat(redHat);
        petr.kill(wolf);
    }
}
