package com.hneu.hw.hw2.repairs;

public class AccountingForScheduledRepairs {

    private int id;
    private String typeOfWork;
    private String name;
    private double scopeOfWork;
    private double priceTime;

    public AccountingForScheduledRepairs(int id, String typeOfWork, String name, double scopeOfWork, double priceTime) {
        this.id = id;
        this.typeOfWork = typeOfWork;
        this.name = name;
        this.scopeOfWork = scopeOfWork;
        this.priceTime = priceTime;
    }

    public int getId() {
        return id;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public String getName() {
        return name;
    }

    public double getScopeOfWork() {
        return scopeOfWork;
    }

    public double getPrice() {
        return priceTime;
    }

    public double fullPrice() { return scopeOfWork * priceTime; }

}
