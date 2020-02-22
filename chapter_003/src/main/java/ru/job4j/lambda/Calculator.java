package ru.job4j.lambda;

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
    public void multiple(int start, int finish, int value, Operation op) {
        for (int index = start; index != finish; index++) {
            System.out.println(op.calc(value, index));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(0, 10, 2, new Operation() {
            @Override
            public double calc(int left, int right) {
                return left * right;
            }
        });
    }


}
