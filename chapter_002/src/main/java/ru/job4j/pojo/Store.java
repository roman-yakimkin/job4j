package ru.job4j.pojo;

/**
 * Класс - магазин
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 */
public class Store {

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[3];

        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        for (int i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }

        System.out.println("Replacing milk to oil");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;

        for (int i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }

    }
}
