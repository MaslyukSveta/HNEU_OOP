package com.hneu.hw.h4.Worker;


public class MathProxy implements IMathProxy {

    private Math math;

    private static IMathProxy instance;

    public MathProxy(double num) {

    }

    public static IMathProxy getInstance(double num) {
        if(instance == null){
            instance = (IMathProxy) new MathProxy(num);

        }
        return instance;

     }


    @Override
    public double MathProxy(double num) {
        return java.lang.Math.sqrt(num);
    }

    @Override
    public double add(double num1, double num2) {

        return math.add(num1,num2 );
    }
    @Override
    public double sub(double num1, double num2) {

        return math.sub(num1,num2);
    }
    @Override
    public double mul(double num1, double num2) {

        return math.mul(num1,num2);
    }

    @Override
    public double div(double num1, double num2) {

        return math.div(num1,num2);
    }

}
