package ru.job4j.collection;

/**
 * Класс - задача
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 16.01.2020
 * @version 1.0
 */
public class Job implements Comparable<Job> {
    /**
     * Название задачи
     */
    private String name;
    /**
     * Приоритет задачи
     */
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" +  name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job job) {
        return Integer.compare(priority, job.priority);
    }
}
