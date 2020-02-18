package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс - заказ
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class Order {
    private String number;
    private String name;

    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{"
                + "number='" + number + '\''
                + ", name='" + name + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(getNumber(), order.getNumber()) && Objects.equals(getName(), order.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getName());
    }
}
