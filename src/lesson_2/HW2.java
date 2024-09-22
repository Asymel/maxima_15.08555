package lesson_2;

public class HW2 {
    public static void main(String[] args) {

//        Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
//        Вывести на консоль
        //Вариант 1
        float rub = 5;
        byte allCashRegister = 2;
        float cashRegister = rub / allCashRegister;
        System.out.println(cashRegister + " рублей в кассе ");
        //Вариант 2

        float rub2 = 5;
        float cashRegister2 = rub2 / 2;
        System.out.println(cashRegister2 + " рублей в кассе ");


//        Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
//        Вывести на консоль

        byte q = 50;
        int s = q * q;
        System.out.println("площадь равна " + s );

        byte q1 = 20;
        int s1 = q1 * q1;
        System.out.println("площадь равна " + s1 );

//        Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//                насколько быстрее голодный Вася съедает один банан?
//        Вывести на консоль

        byte bananasHungry = 9;
        byte bananasSpissedOff = 15;
        int oneBananaHungry = bananasHungry / 3;
        int oneBananaSpissedOff = bananasSpissedOff / 3;
        int faster = oneBananaSpissedOff - oneBananaHungry;
        System.out.println("на " + faster + " минуты быстрее ");


    }


}

