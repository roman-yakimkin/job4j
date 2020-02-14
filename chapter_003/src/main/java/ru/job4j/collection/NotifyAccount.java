package ru.job4j.collection;

import java.util.*;

/**
 * Шаблон информационной рассылки
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class NotifyAccount {
    /**
     * Получение уникального мноества клиентов
     * @param accounts - список счетов
     * @return - множество клиентов
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<Account>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
