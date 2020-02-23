package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Класс - калькулятор с функциональным интерфейсом
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 22.02.2020
 */
public class Calculator {

    /**
     * Функциональный интерфейс
     */
    public interface Operation {
        double calc(int left, int right);
    }

    /**
     * Функция для умножения с использованием функционального интерфейса
     * @param start - начальное значение
     * @param finish - конечное значение
     * @param value - множитель
     * @param op - ссылка на функциональный интерфейс
     */
    public void multiple(int start, int finish, int value, BiFunction<Integer, Integer, Double> op, Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(0, 10, 2, MathUtil::add,
                result -> System.out.println(result));
    }


}
