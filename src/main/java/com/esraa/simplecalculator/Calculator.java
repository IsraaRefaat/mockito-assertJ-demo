package com.esraa.simplecalculator;

public class Calculator {

    public double add(double a, double b) {
        double result = a + b;
        if(result >= 100)
            throw new RuntimeException("Warning: Result is too large");
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        if (result < 0)
            throw new RuntimeException("Warning: Negative results are not allowed");
        return result;
    }

    public double multiply(double a, double b) {
        if(a==0 || b==0)
            throw new RuntimeException("Warning: Multiplication by zero is not allowed");
        return a * b;
    }

    public double divide(double a, double b) {
        if(b == 0)
            throw new RuntimeException("Warning: Division by zero is not allowed");
        return a / b;
    }
}
