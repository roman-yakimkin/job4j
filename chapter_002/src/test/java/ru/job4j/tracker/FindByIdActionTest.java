package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByIdActionTest {

    @Test
    public void executeAction() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindByIdAction action = new FindByIdAction();
        action.execute(new StubInput(new String[] {item.getId()}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("ID: " + item.getId() + ", name: " + item.getName())
                .toString();

        assertThat(new String(out.toByteArray()), is(expect));
    }
}
