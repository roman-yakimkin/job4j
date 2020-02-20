package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.OrderingComparison.lessThan;
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
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndAge() {
        Comparator<User> cmpNameAge = new UserDescByName().thenComparing(new UserDescByAge());
        int rsl = cmpNameAge.compare(
                new User("Sidorov", 30),
                new User("Ivanov", 40)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAgeAndName() {
        Comparator<User> cmp = new UserDescByAge().thenComparing(new UserDescByName());
        int rsl = cmp.compare(
                new User("Sidorov", 30),
                new User("Ivanov", 40)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndAgeAsc() {
        Comparator<User> cmpNameAge = new UserAscByName().thenComparing(new UserAscByAge());
        int rsl = cmpNameAge.compare(
                new User("Sidorov", 30),
                new User("Ivanov", 40)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAgeAndNameAsc() {
        Comparator<User> cmp = new UserAscByAge().thenComparing(new UserAscByName());
        int rsl = cmp.compare(
                new User("Sidorov", 30),
                new User("Ivanov", 40)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByName() {
        Comparator<User> cmp = new UserAscByName();
        int rsl = cmp.compare(
                new User("Sidorov", 30),
                new User("Ivanov", 40)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAge() {
        Comparator<User> cmp = new UserAscByAge();
        int rsl = cmp.compare(
                new User("Sidorov", 30),
                new User("Ivanov", 40)
        );
        assertThat(rsl, lessThan(0));
    }
}
