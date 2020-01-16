package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in, expected, out;
        boolean passed;

        in = 140;
        expected = 2;
        out = rubleToEuro(in);
        passed = (expected == out);
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = (expected == out);
        System.out.println("180 rubles are 3. Test result : " + passed);

        in = 5;
        expected = 350;
        out = euroToRuble(in);
        passed = (expected == out);
        System.out.println("5 euros are 350. Test result : " + passed);

        in = 4;
        expected = 240;
        out = dollarToRuble(in);
        passed = (expected == out);
        System.out.println("4 dollars are 240. Test result : " + passed);
    }
}
