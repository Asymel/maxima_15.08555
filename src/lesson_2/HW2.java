package lesson_2;

public class HW2 {
    public static void main(String[] args) {

//        Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
//        Вывести на косоль
        //Вариант 1
        float a = 5;
        byte b = 2;
        float c1 = a / b;
        System.out.println(c1);
        //Вариант 2

        float a1 = 5;
        float c = a1 / 2;
        System.out.println(c);


//        Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
//        Вывести на косоль

        byte q = 50;
        int s = q * q;
        System.out.println(s);

        byte q1 = 20;
        int s1 = q1 * q1;
        System.out.println(s1);

//        Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//                насколько быстрее голодный Вася съедает один банан?
//        Вывести на косоль

        byte t = 9;
        byte t1 = 15;
        int t2 = t1 - t;
        System.out.println(t2);


    }


}

