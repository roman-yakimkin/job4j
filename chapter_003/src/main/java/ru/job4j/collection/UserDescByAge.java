package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор для пользователя по возрасту по убыванию
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.02.2020
 * @version 1.0
 */
public class UserDescByAge implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return Integer.compare(user2.getAge(), user1.getAge());
    }
}
