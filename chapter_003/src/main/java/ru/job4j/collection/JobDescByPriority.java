package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс - компаратор по убыванию приоритета для класса Job
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.02.2020
 * @version 1.0
 */
public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job job, Job t1) {
        return Integer.compare(t1.getPriority(), job.getPriority());
    }
}
