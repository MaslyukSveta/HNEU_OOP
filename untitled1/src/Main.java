import java.util.Scanner;

public class Main {
    public static double calculateAverageDiameter(Apple[] lst) {
        double sum = 0;
        for (int i = 0; i < lst.length; i++)
            sum += lst[i].getDiameter();
        return sum/lst.length;
    }

    public static void printList(Apple[] lst)
    {
        System.out.format(" %1$-10s %2$-10s %3$-8s %4$-8s\n", "Цвет", "Сорт", "Диаметр", "Объем");
        for (Apple apl : lst)
        {
            System.out.format("|%1$-10s|%2$-10s|%3$-8.2f|%4$-8.2f|\n", apl.getSort(), apl.getColor(),
                    apl.getDiameter(), apl.calculateVolume());
        }
        System.out.format("\nИтого:%21.2f",  calculateAverageDiameter(lst));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество яблок: ");
        int n = sc.nextInt();
        Apple[] myArr = new Apple[n];
        String sort, color;
        double diameter;
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Введите сорт яблока: ");
            sort = sc.next();
            System.out.print("Введите цвет яблока: ");
            color = sc.next();
            System.out.print("Введите диаметр яблока: ");
            diameter = sc.nextDouble();

            Apple apl = new Apple(sort, color, diameter);
            myArr[i] = apl;
        }
        printList(myArr);
    }
}