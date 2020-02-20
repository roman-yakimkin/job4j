package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Класс для демонстрации действия комбинированных компараторов для класса User
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.02.2020
 * @version 1.0
 */
public class UserSorter {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Ivanov Petr", 23),
                new User("Petrov Ivan", 21),
                new User("Sidorov Michail", 34),
                new User("Ivanov Pavel", 18)
        );
        System.out.println(users);

        Collections.sort(users, new UserAscByName().thenComparing(new UserAscByAge()));
        System.out.println(users);

        Collections.sort(users, new UserAscByAge().thenComparing(new UserAscByName()));
        System.out.println(users);

        Collections.sort(users, new UserDescByName().thenComparing(new UserDescByAge()));
        System.out.println(users);

        Collections.sort(users, new UserDescByAge().thenComparing(new UserDescByName()));
        System.out.println(users);
    }
}
