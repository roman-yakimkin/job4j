package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Класс - предсказатель
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 29.01.2020
 */
public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я - великий Оракул! Что ты хочешь узнать? ");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            default:
                System.out.println("Не знаю");
        }
    }
}
