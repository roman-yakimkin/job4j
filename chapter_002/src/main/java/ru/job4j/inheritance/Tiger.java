package ru.job4j.inheritance;

/**
 * Класс, представляющий тигра
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 23.01.2020
 * @version 1.0
 */
public class Tiger extends Predator {

    /**
     * Конструктор
     */
    public Tiger() {
        super();
        System.out.println("Tiger has been created");
    }

    /**
     * Конструктор с именем
     * @param name - имя тигра
     */
    public Tiger(String name) {
        super(name);
        System.out.println("Tiger " + this.name + " has been created");
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Giant");

    }
}
