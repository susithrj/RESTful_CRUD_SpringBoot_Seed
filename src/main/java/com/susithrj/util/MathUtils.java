package com.susithrj.util;

public class MathUtils {
    public int sum(int a, int b) {
        return  a+b ;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}