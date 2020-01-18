package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double remains = (double) amount;
        do {
            remains = remains * (1 + percent / 100) - salary;
            year++;
        } while (remains > 0);
        return year;
    }
}
