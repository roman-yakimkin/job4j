package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(Optional.of(user)));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150.0));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150.0));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150.0));
        bank.addAccount(user.getPassport(), new Account("113", 50.0));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150.0);
        assertThat(bank.findByRequisite("3434", "113").get().getBalance(), is(200.0));
    }
}
