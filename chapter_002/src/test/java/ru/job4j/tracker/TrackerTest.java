package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void testFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item3");
        tracker.add(item3);
        Item[] expected = {new Item(item1), new Item(item2), new Item(item3)};
        Item[] result = tracker.findAll();
        assertArrayEquals(result, expected);
    }

    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item3");
        tracker.add(item3);
        Item itemExpected = new Item(item3);
        Item item4 = new Item("Item4");
        tracker.add(item4);
        Item item5 = new Item("Item5");
        tracker.add(item5);

        Item result = tracker.findById(itemExpected.getId());
        assertThat(result.getName(), is(itemExpected.getName()));
    }

    @Test
    public void testFindByIdAndFail() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item3");
        tracker.add(item3);
        Item item4 = new Item("Item4");
        tracker.add(item4);
        Item item5 = new Item("Item5");
        tracker.add(item5);

        Item result = tracker.findById("FictitiousId");
        assertNull(result);
    }

    @Test
    public void testFindByNameItem3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item3");
        tracker.add(item3);
        Item item4 = new Item("Item3");
        tracker.add(item4);
        Item item5 = new Item("Item2");
        tracker.add(item5);

        Item[] expected = {new Item(item3), new Item(item4)};
        Item[] result = tracker.findByName("Item3");

        assertArrayEquals(result, expected);
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDeleteItem3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item3");
        tracker.add(item3);
        Item item4 = new Item("Item3");
        tracker.add(item4);
        Item item5 = new Item("Item2");
        tracker.add(item5);

        Item[] expected = {new Item(item1), new Item(item2), new Item(item4), new Item(item5)};
        tracker.delete(item3.getId());

        assertArrayEquals(tracker.findAll(), expected);
    }

    @Test
    public void whenDeleteFails() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item1");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item3");
        tracker.add(item3);
        Item item4 = new Item("Item3");
        tracker.add(item4);
        Item item5 = new Item("Item2");
        tracker.add(item5);

        Item[] expected = {new Item(item1), new Item(item2), new Item(item3), new Item(item4), new Item(item5)};
        tracker.delete("fictitiousItemId");

        assertArrayEquals(tracker.findAll(), expected);
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}
