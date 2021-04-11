package com.hneu.hw.hw3.Worker;

public class OrdinaryCalc {


    protected double num1, num2;

    public OrdinaryCalc() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {
        return (num1 + num2);
    }

    public double sub() {
        return (num1 - num2);
    }

    public double mul() {
        return (num1 * num2);
    }

    public double div() {
        return (num1 / num2);
    }


}
