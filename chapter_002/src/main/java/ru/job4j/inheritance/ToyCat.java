package ru.job4j.inheritance;

/**
 * Класс, описывающий игрушечную кошку
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 23.01.2020
 * @version 1.0
 */
public class ToyCat extends Cat {

    /**
     * Может ли игрушечная кошка быть выстирана в стиральной машине?
     * @return истина, если может
     */
    public boolean canBeWashedByWashingMachine() {
        return true;
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashedByWashingMachine());
    }
}
