package com.hneu.hw.hw2.repairs;

public class AccountingList {

    private AccountingForScheduledRepairs[] lst;

    public AccountingList(int n) {
        lst = new AccountingForScheduledRepairs[n];
    }
    public void addAccountingForScheduledRepairs(AccountingForScheduledRepairs afsr, int index) {
        lst[index] = afsr;
    }
    public  double calculateScopeOfWork(AccountingForScheduledRepairs[] lst) {
        double sum = 0;
        for (int i = 0; i < lst.length; i++)
            sum += lst[i].getScopeOfWork();
        return sum;
    }
    public  double calculatePriceTime(AccountingForScheduledRepairs[] lst) {
        double sum = 0;
        for (int i = 0; i < lst.length; i++)
            sum += lst[i].getPrice();
        return sum;
    }
    public  double calculateFullPrice(AccountingForScheduledRepairs[] lst) {
        double sum = 0;
        for (int i = 0; i < lst.length; i++)
            sum += lst[i].fullPrice();
        return sum;
    }

    public void printList() {

        System.out.println("_________________________________________________________________________________________________________");
        System.out.format("| %1$-5s | %2$-10s | %3$-8s | %4$-8s | %5$-8s| %6$-8s |\n", "№ з/п","Вид робіт", "Назва об’єкту ремонту", "Об’єм робіт, (час)", "Ціна, грн./час", "Загальна ціна, грн." );
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (AccountingForScheduledRepairs afsr : lst)
        {
            System.out.format("| %1$-5d | %2$-10s | %3$-21s | %4$-18.2f | %5$-13.2f | %6$-19.2f |\n", afsr.getId(), afsr.getTypeOfWork(), afsr.getName(),
                    afsr.getScopeOfWork(), afsr.getPrice(), afsr.fullPrice());
            System.out.println("---------------------------------------------------------------------------------------------------------");
        }
        System.out.format("|       | Разом      |                       | %1$-18.2f | %2$-13.2f | %3$-19.2f |", calculateScopeOfWork(lst),  calculatePriceTime(lst), calculateFullPrice(lst));
        System.out.println("\n---------------------------------------------------------------------------------------------------------");
    }
}
