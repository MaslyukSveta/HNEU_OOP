package com.hneu.hw.hw3.Runner;

import com.hneu.hw.hw3.Worker.AbsractCalc;
import com.hneu.hw.hw3.Worker.AdvancedCalc;
import com.hneu.hw.hw3.Worker.OrdinaryCalc;

import java.util.Scanner;

public class Runner {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        OrdinaryCalc oc = new OrdinaryCalc();
        AdvancedCalc ac = new AdvancedCalc();
        int choice3 = 2;
        while(choice3 == 2) {
            System.out.println("Ведіть номер калькулятору: ");
            System.out.println("1 - стандартний");
            System.out.println("2 - інженерний");


            int choice1 = scanner.nextInt();
            int choice2 = 1;
            while (choice2 == 1) {
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

    public static double getDouble(){
        System.out.println("Ведіть число:");
        Double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Ви допустили помилку, спробуйте ще");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static int  getOperationOrdinaryCalk(){
        System.out.println("Введите операцию:");
        System.out.println("1 - додавання");
        System.out.println("2 - віднімання");
        System.out.println("3 - множення");
        System.out.println("4 - ділення");

        int operation;
        if(scanner.hasNextInt()){
            operation = scanner.nextInt();
        } else {
            System.out.println("Ви допустили помилку. Спробуйте ще раз.");
            scanner.next();
            operation = getOperationOrdinaryCalk();
        }
        return operation;
    }
    public static int  getOperationAdvancedCalk(){
        System.out.println("Введите операцию:");
        System.out.println("1 - додавання");
        System.out.println("2 - віднімання");
        System.out.println("3 - множення");
        System.out.println("4 - ділення");
        System.out.println("5 - инженерне");

        int operation;
        if(scanner.hasNextInt()){
            operation = scanner.nextInt();
        } else {
            System.out.println("Ви допустили помилку. Спробуйте ще раз.");
            scanner.next();
            operation = getOperationAdvancedCalk();
        }
        return operation;
    }
    public static double ordinaryCalc(int operation){

        OrdinaryCalc oc = new OrdinaryCalc();

        double num1 = getDouble();
        double num2 = getDouble();

        oc.setNum1(num1);
        oc.setNum2(num2);

        double result;

        switch (operation){
            case 1:
                result = oc.add();
                break;
            case 2:
                result = oc.sub();
                break;
            case 3:
               result = oc.mul();
                break;
            case 4:
                result = oc.div();
                break;
            default:
                System.out.println("Операція не виконана. Повторіть дію.");
                result = ordinaryCalc(getOperationOrdinaryCalk());
        }
        return result;
    }

        public static double advanceCalk(int operation){

            AdvancedCalc ac = new AdvancedCalc();

            double num1 = getDouble();
            double num2 = getDouble();

            ac.setNum1(num1);
            ac.setNum2(num2);

            double result;

            switch (operation){
                case 1:
                    result = ac.add();
                    break;
                case 2:
                    result = ac.sub();
                    break;
                case 3:
                    result = ac.mul();
                    break;
                case 4:
                    result = ac.div();
                    break;
                case 5:
                    result = ac.pow();
                    break;
                default:
                    System.out.println("Операція не виконана. Повторіть дію.");
                    result = ordinaryCalc(getOperationOrdinaryCalk());
            }
            return result;

    }


}

