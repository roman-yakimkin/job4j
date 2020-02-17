package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petrov Ivan", 30));
        users.add(new User("Sokolov Mihail", 40));
        users.add(new User("Petrov Ivan", 65));
        users.add(new User("Sergeev Alexey", 42));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Petrov Ivan", 30)));
        assertThat(it.next(), is(new User("Petrov Ivan", 65)));
        assertThat(it.next(), is(new User("Sergeev Alexey", 42)));
        assertThat(it.next(), is(new User("Sokolov Mihail", 40)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}
