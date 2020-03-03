package ru.job4j.lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Класс для тестирования зоны видимости переменных
 * @author Roman Yakimkin
 * @version 1.0
 * @since 1.0
 */
public class LambdaVars {

    public void operations() {
        final int value = 5;

        UnaryOperator<Integer> sqr = (arg) -> {
            return arg * arg;
        };

        UnaryOperator<Integer> sum = (arg) -> {
            return arg + value;
        };

        System.out.println(sqr.apply(10));
        System.out.println(sum.apply(10));

    }

    public static void main(String[] args) {
        new LambdaVars().operations();
    }
}
