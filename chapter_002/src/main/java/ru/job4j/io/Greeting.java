package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс - простое приветствие
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 29.01.2020
 * @version 1.0
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть !");
    }
}
