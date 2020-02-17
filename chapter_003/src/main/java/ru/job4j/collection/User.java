package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс - пользователь
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 17.02.2020
 * @version 1.0
 */
public class User implements Comparable<User> {
    /**
     * Имя пользователя
     */
    private String name;
    /**
     * Возраст пользователя
     */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User user) {
        return name.compareTo(user.name) == 0 ? (age - user.age) : name.compareTo(user.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
