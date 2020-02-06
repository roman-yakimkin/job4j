package ru.job4j.tracker;

/**
 * Циклический консольный ввод с проверкой значений
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 06.02.2020
 * @version 1.0
 */
public class ValidateInput extends ConsoleInput {
    /**
     * Циклический ввод целого числа
     * @param question - текст приглашения ко вводу
     * @return - целое число
     */
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please input valid data again.");
            }
        } while (invalid);
        return value;
    }

    /**
     * Циклический ввод целого числа в заданном промежутке
     * @param question - текст приглашения ко вводу
     * @param max - максимальное значение
     * @return - целое число
     */
    @Override
    public int askInt(String question, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question, max);
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select a key from menu");
            } catch (NumberFormatException nfe) {
                System.out.println("Please input valid data again");
            }
        } while (invalid);
        return value;
    }
}
