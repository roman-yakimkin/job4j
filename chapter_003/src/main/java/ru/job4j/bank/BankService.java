package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс - банковский сервис
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.02.2020
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

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
        Optional<User> user = findByPassport(passport);
        user.ifPresent((u) -> users.get(u).add(account));
    }

    /**
     * Найти информацию о пользователе по его паспортным данным
     * @param passport - паспортные данные
     * @return - информация о пользователе
     */
    public Optional<User> findByPassport(String passport) {
       return users.keySet().stream()
               .filter(user -> user.getPassport().equals(passport))
               .findAny();
    }

    /**
     * Получить информацию об аккаунте по паспорту пользователю и реквизитам аккаунта
     * @param passport - паспорт пользователя
     * @param requisite - реквизиты аккаунта
     * @return - информация об аккаунте
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.isEmpty() ? Optional.empty() : users.get(user.get()).stream()
                .filter(account -> account.equals(new Account(requisite, -1)))
                .findAny();
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dstAccount = findByRequisite(dstPassport, dstRequisite);

        if (srcAccount.isPresent() && dstAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            dstAccount.get().setBalance(dstAccount.get().getBalance() + amount);
            result = true;
        }

        return result;
    }
}
