package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionTest {

    @Test
    public void executeAction() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        tracker.add(item1);
        Item item2 = new Item("item2");
        tracker.add(item2);
        Item item3 = new Item("item3");
        tracker.add(item3);
        Item item4 = new Item("item3");
        tracker.add(item4);
        Item item5 = new Item("item4");
        tracker.add(item5);
        FindByNameAction action = new FindByNameAction();
        action.execute(new StubInput(new String[] {"item3"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("ID: " + item3.getId() + ", name: " + item3.getName())
                .add("ID: " + item4.getId() + ", name: " + item4.getName())
                .toString();

        assertThat(new String(out.toByteArray()), is(expect));
    }
}
