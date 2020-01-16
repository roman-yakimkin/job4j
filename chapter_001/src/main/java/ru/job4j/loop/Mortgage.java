package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double debtAfterPayment = (double) amount;
        do {
            debtAfterPayment = debtAfterPayment * (1 + percent / 100) - salary;
            year++;
        } while (debtAfterPayment > 0);

        return year;
    }
}
