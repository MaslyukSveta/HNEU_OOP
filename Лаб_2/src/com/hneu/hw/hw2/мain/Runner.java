package com.hneu.hw.hw2.мain;

import com.hneu.hw.hw2.repairs.AccountingForScheduledRepairs;
import com.hneu.hw.hw2.repairs.AccountingList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество ячеек: ");
        int n = sc.nextInt();
        AccountingList vedomost = new AccountingList(n);
        int id;
        String typeOfWork;
        String name;
        double scopeOfWork;
        double priceTime;
        AccountingForScheduledRepairs afsr;
        for (int i = 0; i < n; i++) {
            System.out.print("№ з/п: ");
            id = sc.nextInt();
            System.out.print("Вид робіт: ");
            typeOfWork = sc.next();
            System.out.print("Назва об’єкту ремонту: ");
            name = sc.next();
            System.out.print("Об’єм робіт, (час): ");
            scopeOfWork = sc.nextInt();
            System.out.print("Ціна, грн./час: ");
            priceTime = sc.nextDouble();
            System.out.println();
            afsr = new AccountingForScheduledRepairs(id, typeOfWork, name, scopeOfWork, priceTime);
            vedomost.addAccountingForScheduledRepairs(afsr, i);
        }
        sc.close();
        System.out.println();
        vedomost.printList();
        System.out.println();
    }

}
