package ru.job4j.stream;

import ru.job4j.collection.ListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Класс для тестирования Stream map и flatMap
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class StreamMap {
    public static void main(String[] args) {
        String[] poem = {
                "У лукоморья дуб зеленый",
                "Златая цепь на дубе том",
                "И днем и ночью кот ученый",
                "Всё ходит по цепи кругом",
                "Идет направо - песнь заводит",
                "Налево - сказку говорит",
                "Там чудеса, там леший бродит",
                "Русалка на ветвях сидит"
        };

        // Output lines
        Arrays.stream(poem).forEach(System.out::println);

        // Output lengths
        Arrays.stream(poem).map(String::length).forEach(System.out::println);

        // Output separated words
        var words = Arrays.stream(poem).flatMap(line -> Arrays.stream(line.split("[ ,-]"))).filter(word -> word.length() > 3).collect(Collectors.toList());
        System.out.println(words);

        // Output findFirst
        var word = Arrays.stream(poem).flatMap(line -> Arrays.stream(line.split("[ ,-]"))).filter(w -> w.length() > 13).findFirst();
        System.out.println(word.getClass().getName());
        System.out.println(word);

        IntStream.iterate(0, i -> i < 30, i -> i + 2).forEach(System.out::println);
    }
}
