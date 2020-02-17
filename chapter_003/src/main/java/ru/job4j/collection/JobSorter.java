package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Класс для демонстрации сортировки задач
 * @author Roman Yakimkin
 * @since 17.02.2020
 * @version 1.0
 */
public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl tasks", 2),
                new Job("Reboot the server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
    }
}
