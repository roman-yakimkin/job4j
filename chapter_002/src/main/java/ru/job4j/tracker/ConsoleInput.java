package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Консольный ввод информации
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 31.01.2020
 * @version 1.0
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Ввод строкового значения в консоли
     * @param question - текст приглашения ко вводу
     * @return - введенная строка
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Ввод целочисленного значения в консоли
     * @param question - текст приглашения ко вводу
     * @return - целое число
     */
    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
