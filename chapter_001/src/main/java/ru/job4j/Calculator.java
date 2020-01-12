package ru.job4j;

public class Calculator {
    public static void add(double first, double second){
        double result = first + second;
        System.out.println(first + " + " + second + " = " +result);
    }

    public static void subtract(double first, double second){
        double result = first - second;
        System.out.println(first + " - " + second + " = " +result);
    }

    public static void multiply(double first, double second){
        double result = first * second;
        System.out.println(first + " * " + second + " = " +result);
    }

    public static void div(double first, double second){
        if (second == 0){
            System.out.println("It's not a good idea to divide by zero");
        } else {
            double result = first / second;
            System.out.println(first + " / " + second + " = " +result);
        }
    }

    public static void main(String[] args) {
        add(1,1);
        div(4,2);
        multiply(2,1);
        subtract(10,5);
    }
}
