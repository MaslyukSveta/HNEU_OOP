package com.hneu.hw.h4.program;


import com.hneu.hw.h4.Worker.IMath;
import com.hneu.hw.h4.Worker.IMathProxy;
import com.hneu.hw.h4.Worker.Math;
import com.hneu.hw.h4.Worker.MathProxy;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        IMath proxy = new Math();


        int choice3 = 2;
        while (choice3 == 2) {

            System.out.println("Виберіть тип операції: ");
            System.out.println("1 - стандартна");
            System.out.println("2 - додаткове завдання");
            System.out.println("3 - Exit");

            int choice1 = scanner.nextInt();

            for (int choice2 = 1; choice2 == 1; choice2 = scanner.nextInt()) {

                if (choice1 == 1) {

                    int operation = getOperationOrdinaryCalk();
                    double result = ordinaryCalc(operation);
                    System.out.println("Результат операции: " + result);

                } else if (choice1 == 2) {
                    int operation = getOperationAdvancedCalk();
                    double result = advanceCalk(operation);

                    System.out.println("Результат операции: " + result);
                }

                System.out.println("Щоб повторити операцію, натисніть 1");
                System.out.println("Щоб повернутися до початкового меню, натисніть 2");
                choice2 = scanner.nextInt();

            }
        }
    }

    public static double getDouble() {
        System.out.println("Ведіть число:");
        Double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Ви допустили помилку, спробуйте ще");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static int getOperationOrdinaryCalk() {
        System.out.println("Введите операцию:");
        System.out.println("1 - додавання");
        System.out.println("2 - віднімання");
        System.out.println("3 - множення");
        System.out.println("4 - ділення");

        int operation;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Ви допустили помилку. Спробуйте ще раз.");
            scanner.next();
            operation = getOperationOrdinaryCalk();
        }
        return operation;
    }

    public static int getOperationAdvancedCalk() {
        System.out.println("Ведіть операцію:");
        System.out.println("1 - корінь з числа");


        int operation;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Ви допустили помилку. Спробуйте ще раз.");
            scanner.next();
            operation = getOperationAdvancedCalk();
        }
        return operation;
    }

    public static double ordinaryCalc(int operation) {

        IMath proxy = new Math();

        double num1 = getDouble();
        double num2 = getDouble();


        double result;

        switch (operation) {
            case 1:
                result = proxy.add(num1, num2);
                break;
            case 2:
                result = proxy.sub(num1, num2);
                break;
            case 3:
                result = proxy.mul(num1, num2);
                break;
            case 4:
                result = proxy.div(num1, num2);
                break;
            default:
                System.out.println("Операція не виконана. Повторіть дію.");
                result = ordinaryCalc(getOperationOrdinaryCalk());
        }
        return result;
    }

    public static double advanceCalk(int operation) {



        double result;

        System.out.println("Ведіть число:");

            double num = getDouble();
            IMathProxy mp = new MathProxy(num);






        return mp.MathProxy(num);
    }



}
