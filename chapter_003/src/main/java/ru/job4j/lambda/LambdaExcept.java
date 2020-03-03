package ru.job4j.lambda;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Тестовый класс для изучения исключений внутри лямбда - функции
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class LambdaExcept {
    public static void main(String[] args) {
        Function<int[], Integer> sum = (arr) -> {
            int result = 0;
            for (int i = 0; i <= arr.length + 1; i++) {
                try {
                    result += arr[i];
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            return result;
        };

        System.out.println(sum.apply(new int[]{10, 20, 30, 1}));

        int[] a2 = new int[1];
        System.out.println(sum.apply(a2));
    }
}
