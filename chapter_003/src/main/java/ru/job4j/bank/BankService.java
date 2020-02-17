package ru.job4j.bank;

import java.util.*;

/**
 * Класс - банковский сервис
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.02.2020
 * @version 1.0
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавить пользователя
     * @param user - пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавить банковский счет для пользователя
     * @param passport - паспорт пользователя
     * @param account - банковской счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            accounts.add(account);
        }
    }

    /**
     * Найти информацию о пользователе по его паспортным данным
     * @param passport - паспортные данные
     * @return - информация о пользователе
     */
    public User findByPassport(String passport) {
        User result = null;
        List<User> userList = new ArrayList<>(users.keySet());
        int index = userList.indexOf(new User(passport, "dummy"));
        if (index != -1) {
            result = userList.get(index);
        }
        return result;
    }

    /**
     * Получить информацию об аккаунте по паспорту пользователю и реквизитам аккаунта
     * @param passport - паспорт пользователя
     * @param requisite - реквизиты аккаунта
     * @return - информация об аккаунте
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {

            List<Account> accounts = users.get(user);
            int index = accounts.indexOf(new Account(requisite, -1));
            if (index != -1) {
                return accounts.get(index);
            }
        }
        return null;
    }

    /**
     * Перечислить деньги с одного счета на другой счет
     * @param srcPassport - паспорт исходного пользователя
     * @param srcRequisite - реквизиты счета исходного пользователя
     * @param dstPassport - паспорт конечного пользователя
     * @param dstRequisite - реквизиты счета конечного пользователя
     * @param amount - перечисляемая сумма
     * @return - истина, если операция завершилась успешно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String dstPassport, String dstRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account dstAccount = findByRequisite(dstPassport, dstRequisite);

        if (srcAccount != null && dstAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            dstAccount.setBalance(dstAccount.getBalance() + amount);
            result = true;
        }

        return result;
    }
}
