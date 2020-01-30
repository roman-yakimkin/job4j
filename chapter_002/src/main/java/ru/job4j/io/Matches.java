package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс, реализующий игру в 11 спичек
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.01.2020
 * @version 1.0
 */
public class Matches {

    @SuppressWarnings("checkstyle:ParenPad")
    public static void main(String[] args) {
        int matches = 11;
        int currentPlayer = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Осталось спичек " + matches);
            int maxMatches = Math.min(3, matches);
            System.out.println(currentPlayer + "-й игрок берет спички. Можно брать от 1 до " + matches + ". Сколько спичек хотите взять ?");
            int select = Integer.parseInt(scanner.nextLine());
            if ((select >= 1) && (select <= maxMatches)) {
                matches -= select;
                if (matches > 0) {
                    currentPlayer = (currentPlayer == 1) ? 2 : 1;
                } else {
                    System.out.println(currentPlayer + "-й игрок взял последнюю спичку");
                }
            } else {
                System.out.println("Неверное количество спичек");
            }

        } while (matches > 0);
    }
}
