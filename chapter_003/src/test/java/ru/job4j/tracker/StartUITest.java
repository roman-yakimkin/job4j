package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Test
    public void whenAddItem() {
        String[] answers = {"0", "Fix PC", "6"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        Consumer<String> output = System.out::println;
        List<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()

        ));
        new StartUI().init(input, tracker, actions, output);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {"2", item.getId(), "replaced item", "6"};
        Input input = new StubInput(answers);
        Consumer<String> output = System.out::println;
        List<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        ));
        new StartUI().init(input, tracker, actions, output);

        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {"3", item.getId(), "6"};
        Input input = new StubInput(answers);
        Consumer<String> output = System.out::println;
        List<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()

        ));
        new StartUI().init(input, tracker, actions, output);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        Consumer<String> output = System.out::println;
        new StartUI().init(input, new Tracker(), new ArrayList<UserAction>(Arrays.asList(action)), output);
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        Consumer<String> output = System.out::println;
        new StartUI().init(input, new Tracker(), new ArrayList<UserAction>(Arrays.asList(action)), output);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu (ver. 3)")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

}
