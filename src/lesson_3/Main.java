package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Комментарий к уроку

        /* Какой то
        комменатрий
        */

        /* *
            Арифметические операторы
          + Складывает значемния по обе стороны от оператора
          - Вычетает правый операнд из левого операнда
          * Умножает значение по обе стороны от оператора
          / Оператор деления делит левый операнд на правый операнд
         %  Делит левый операнд на правый и возвращмет остаток
         ++ Инкрумент - уыеличивает значение операнда на 1 x++ постфиуксная, ++х префмксная
         -- декремент - уменьшаетхначение операнда на 1 х-- постфиксная, --ч префиксная
                  * */

        //       // int ost = 8 % 3; // 3 + 3 + 2
//        int ost = 10 % 3; // 3 + 3 + 3 + 1
//        System.out.println(ost);

        //     int a = 1;
//        //int res = a + 1: a + 1 ==== a++
//        int res1 = a++;
//        int res2 = ++a;
//         a++;
//         a++;
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(a);


//        int a = 10;
//
//        System.out.println(a--);

        /* * Операторы сравнения

         == Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным (A == B) – не верны

         != Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным (A != B) – значение истинна

         > Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным (A > B) – не верны

         < Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным (A < B) – значение истинна

         >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным (A >= B) – значение не верны

         <= Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным (A <= B) – значение истинна*/

//                int a = 10;
//        int b = 10;
//        boolean isOneEqualsTwo = a >= b;
//
//        System.out.println(isOneEqualsTwo);

        /* *Логические операторы

         && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         */

//        boolean isWillGoWalking;
//
//        int temperature = 15;
//        boolean isWeekEnd = true;
//
//        isWillGoWalking = isWeekEnd || temperature >= 25;
//
//        System.out.println(isWillGoWalking);

//        boolean c = 250 > 1000;
//
//        System.out.println(!c);


//        boolean isWillGoWalking;
//
//        int temperature = 15;
//        boolean isWeekEnd = false;
//
//        isWillGoWalking = isWeekEnd || temperature >= 25;
//
//        if (isWillGoWalking) {
//            System.out.println("Я сегодня пойду гулять");
//        }
//        else {
//            System.out.println("О нет, сегодня я не пойду гулять");
//        }


//        int dayOfWeek = 15;
//
//        if (dayOfWeek == 1) {
//            System.out.println("Сегодня пн");
//        } else if (dayOfWeek == 2) {
//            System.out.println("Сегодня вт");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Сегодня ср");
//        } else if (dayOfWeek == 4) {
//            System.out.println("Сегодня чт");
//        } else if (dayOfWeek == 5) {
//            System.out.println("Сегодня пт");
//        } else if (dayOfWeek == 6) {
//            System.out.println("Сегодня сб");
//        } else if (dayOfWeek == 7) {
//            System.out.println("Сегодня вс");
//        } else {
//            System.out.println("Мы не знаем такого дня недели");
//        }

        Scanner scanner = new Scanner(System.in); // Ввод данных через консоль
        int a = scanner.nextInt();

        if (a <= 100 && a >= 50) {
            System.out.println(" Число " + a + " содержиться в интервале ");
        } else {
            System.out.println(" Число " + a + " не содержиться в интервале ");
        }


        //       int dayOfWeek = 15;
//
//        if (dayOfWeek == 1) {
//            System.out.println("Сегодня пн");
//        } else if (dayOfWeek == 2) {
//            System.out.println("Сегодня вт");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Сегодня ср");
//        } else if (dayOfWeek == 4) {
//            System.out.println("Сегодня чт");
//        } else if (dayOfWeek == 5) {
//            System.out.println("Сегодня пт");
//        } else if (dayOfWeek == 6) {
//            System.out.println("Сегодня сб");
//        } else if (dayOfWeek == 7) {
//            System.out.println("Сегодня вс");
//        } else {
//            System.out.println("Мы не знаем такого дня недели");
//        }

        int dayOfWeek = 2;

        switch (dayOfWeek) {
            case (1):
                System.out.println("Сегодня пн");
                break;
            case (2):
                System.out.println("Сегодня вт");
                break;
            default:
                System.out.println("Пока я знаю только дни пн и вт");
                break; // Оператор сразу переходит к нужному варианту, не проверяя все варианты(если мы знаем точно!)

        }

    }
}


