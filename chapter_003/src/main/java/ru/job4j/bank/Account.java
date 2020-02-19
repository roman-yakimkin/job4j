package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс - банковский счет
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.02.2020
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты
     */
    private String requisite;
    /**
     * Баланс
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(getRequisite(), account.getRequisite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRequisite());
    }
}
