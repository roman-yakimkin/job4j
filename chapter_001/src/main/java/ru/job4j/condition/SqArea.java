package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k){
        double rectangleWidth = p / (2 * (1 + k));
        double rectangleHeight = rectangleWidth * k;

        return rectangleWidth * rectangleHeight;
    }

    public static void main(String[] args){
        double result1 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result1);
    }
}
