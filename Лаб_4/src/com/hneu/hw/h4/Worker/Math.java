package com.hneu.hw.h4.Worker;

public class Math implements IMath {

    @Override
    public double sub(double num1, double num2) {
        return (num1 - num2);
    }
    @Override
    public double mul(double num1, double num2) {
        return (num1 * num2);
    }
    @Override
    public double div(double num1, double num2) {
        return (num1 / num2);
    }
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
