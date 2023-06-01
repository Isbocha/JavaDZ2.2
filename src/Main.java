public class Main {
    public static void main(String[] args) {
        int balance = 100; //Начальный счет
        int money = 2000; //Сумма пополнения
        int bonusPrice = 100; //Стоимость бонуса
        System.out.println("Привет!");
        System.out.println("Вы пополнили свой счет на сумму:");
        System.out.println(money);
        int bonus;
        if (money > 1000) {
            bonus = (money / bonusPrice);
            System.out.println("Вы получаете бонусы в сумме:");
            System.out.println(money / bonusPrice);
        } else {
            bonus = 0;
            System.out.println("К сожалению, бонусов Вы не получаете");
        }
        System.out.println("Ваш баланс:");
        System.out.println(balance + money + bonus);
    }

}