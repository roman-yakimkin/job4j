package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

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
    public void testFindById() {
        Tracker tracker = new Tracker();
        Item item5 = null;
        for (int i = 0; i < 20; i++) {
            Item item = new Item("Item" + String.valueOf(i));
            tracker.add(item);
            if (i == 5) {
                item5 = item;
            }
        }
        Item result = tracker.findById(item5.getId());
        assertThat(result.getName(), is(item5.getName()));
    }

    @Test
    public void testFindByNameItem3() {
        Tracker tracker = new Tracker();
        String[] itemNames = {"Item1", "Item2", "Item3", "Item3", "Item3", "Item2"};
        Item[] expected = new Item[3];
        int expectedIndex = 0;
        for (String itemName : itemNames) {
            Item item = new Item(itemName);
            tracker.add(item);
            if (itemName.equals("Item3")) {
                expected[expectedIndex++] = new Item(item);
            }
        }
        Item[] result = tracker.findByName("Item3");
        assertArrayEquals(result, expected);
    }
}
