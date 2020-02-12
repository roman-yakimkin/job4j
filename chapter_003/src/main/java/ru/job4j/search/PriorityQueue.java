package ru.job4j.search;

import java.util.LinkedList;

/**
 * Очередь задач
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.02.2020
 * @version 1.0
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /**
     * Добавление задачи по приоритету
     * @param task - добавляемая задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                index++;
            } else {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
