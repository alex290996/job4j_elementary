package ru.job4j;

import static java.lang.Math.sqrt;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pol = (a + b + c) / 2;
        double rsl = sqrt(pol * (pol - a) * (pol - b) * (pol - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
