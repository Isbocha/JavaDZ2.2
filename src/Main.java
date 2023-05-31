// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x = 100; //Начальный счет
        int y = 1700; //Сумма пополнения
        int z = 100; //Стоимость бонуса
        System.out.println("Привет!");
        System.out.println("Вы пополнили свой счет на сумму:");
        System.out.println(y);
        if (y > 1000) {
            System.out.println("Вы получаете бонусы в сумме:");
            System.out.println(y / z);
        } else {
            System.out.println("К сожалению, бонусов Вы не получаете");
        }
    }

}
