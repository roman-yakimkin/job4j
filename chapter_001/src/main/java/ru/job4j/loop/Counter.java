package ru.job4j.loop;

public class Counter {
    public int addUsingWhile(int start, int finish) {
        int i = start;
        int total = 0;
        while (i <= finish) {
            if (i % 2 == 0) {
                total += i;
            }
            i++;
        }
        return total;
    }

    public int addUsingFor(int start, int finish) {
        int total = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
}
