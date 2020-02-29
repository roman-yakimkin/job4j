package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("AA-123456", "Petr Arsentev", "eDer3432f"),
                new Account("AA-345678", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("AA-123456", "Petr Arsentev", "eDer3432f"),
                        new Account("AA-345678", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentWithDuplicates() {
        List<Account> accounts = List.of(
                new Account("AA-123456", "Petr Arsentev", "000001"),
                new Account("AA-123456", "Petr Arsentev", "000002"),
                new Account("AA-888888", "Ivan Ivanov", "000098")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("AA-123456", "Petr Arsentev", "000001"),
                        new Account("AA-888888", "Ivan Ivanov", "000098")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

}
