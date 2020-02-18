package ru.job4j.collection;

import java.util.*;

/**
 * Класс - список департаментов
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 18.02.2020
 */
public class Departments {
    /**
     * Построение списка департаментов
      * @param deps - исходный список департаментов
     * @return - дополненный список департаментов
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new TreeSet<String>();
        for (String value : deps) {
            String[] parents = value.split("/");
            for (int i = 0; i < parents.length; i++) {
                tmp.add(String.join("/", Arrays.copyOfRange(parents, 0, i + 1)));
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Сортировка департаментов по возрастанию
     * @param orgs - список департаментов
     */
    public static void sortAsc(List<String> orgs) {
        orgs.sort(new DepAscComp());
    }

    /**
     * Сортировка департаментов по убыванию
     * @param orgs - список департаментов
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
