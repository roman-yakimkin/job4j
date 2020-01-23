package ru.job4j.oop;

/**
 * Класс, представляющий батарею
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.01.2020
 * @version 1.0
 */
public class Battery {

    /**
     * Заряд батареи
     */
    private int load;

    /**
     * Конструктор батареи
     * @param load - первоначальное значение заряда
     */
    public Battery(int load) {
        this.load = load;
    }

    /**
     * Геттер для поля load
     * @return значение поля load
     */
    public int getLoad() {
        return this.load;
    }

    /**
     * Передать заряд другой батарее
     * @param another
     */
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }

}
