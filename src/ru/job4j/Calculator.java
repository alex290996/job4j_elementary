package ru.job4j;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
}

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static int func1(int x) {
        int y = 1 / x;
        return y;
    }
    /**
    *перегрузка методов
     */
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        String name = "Petr Arsentev";
        hello(name);
        int result1 = func1(3);
        int result2 = func1(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}