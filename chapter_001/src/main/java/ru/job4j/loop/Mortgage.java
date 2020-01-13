package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent){
        int year = 0;
        double debt_after_payment = (double)amount;
        do {
            debt_after_payment = debt_after_payment * (1 + percent/100) - salary;
            year++;
        } while(debt_after_payment > 0);

        return year;
    }
}
