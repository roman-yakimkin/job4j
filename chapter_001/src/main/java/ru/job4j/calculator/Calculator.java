package ru.job4j.calculator;

/**
 * Class Calculator
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 13.01.2020
 * @version 1
 */
public class Calculator {
    public static void add(double first, double second){
        double result = first + second;
        System.out.println(first + " + " + second + " = " +result);
    }

    public static void subtract(double first, double second){
        double result = first - second;
        System.out.println(first + " - " + second + " = " +result);
    }

    public static void multiply(double first, double second){
        double result = first * second;
        System.out.println(first + " * " + second + " = " +result);
    }

    public static void div(double first, double second){
        if (second == 0){
            System.out.println("It's not a good idea to divide by zero");
        } else {
            double result = first / second;
            System.out.println(first + " / " + second + " = " +result);
        }
    }

    /**
     * Main - метод для тестирования арифметических операций
     * @param args
     */
    public static void main(String[] args) {
        add(1,1);
        div(4,2);
        multiply(2,1);
        subtract(10,5);
    }
}
