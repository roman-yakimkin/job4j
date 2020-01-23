package ru.job4j.oop;

/**
 * Учебный класс, представляющий кошку
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 19.01.2020
 * @version 1.0
 */
public class Cat {

    /**
     * Кличка кошки
     */
    private String name;

    /**
     * Еда, которая в распоряжении конкретной кошки
     */
    private String food;

    /**
     * Дать кошке кличку
     * @param nick - кличка для кошки
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Показать еду данной кошки
     */
    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    /**
     * Объект потребляет еду
     * @param meat - потребляемаая еда
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Произнесение звука животным
     * @return voice - произносимый звук
     */
    public String sound() {
        String voice = "may - may";
        return voice;
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        System.out.println("There are Gav's food");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There are Black's food");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
