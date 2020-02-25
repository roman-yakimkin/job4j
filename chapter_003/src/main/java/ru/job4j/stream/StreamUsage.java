package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс для демонстрации Stream API
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 25.02.2020
 * @version 1.0
 */
public class StreamUsage {

    /**
     * Внутренний класс - задача
     */
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" + "name='" + name + '\'' + ", spent=" + spent + '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        bugs.forEach(
                (Task task) -> {
                    System.out.println(task.name);
                }
        );

        long total = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).map(
                task -> task.spent
        ).reduce(0L, Long::sum);
        System.out.println(total);

    }
}
