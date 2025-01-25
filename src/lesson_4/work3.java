package lesson_4;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        //  Ввести с клавиатуры три числа, вывести на экран среднее из них.
//                То есть не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.
//
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа, чтобы найти среднее из них. При равных числах будет выведено соответствующее сообщение"); // Добавил интерактива в консоль//
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        for (int i = a; i > b && i < c; i = 0) {
            System.out.println(a + " среднее число");
        }
        if (a > c && a < b) {
            System.out.println(a + " среднее число");
        }
        for (int i = b; i > a && i < c; i = 0) {
            System.out.println(b + " среднее число");
        }
        if (b < a && b > c) {
            System.out.println(b + " среднее число");
        }
        for (int i = c; i < a && i > b; i = 0) {
            System.out.println(c + " среднее число");
        }
        if (c > a && c < b) {
            System.out.println(c + " среднее число");
        }
        if (a == b && a == c) {
            System.out.println(" Заданные числа равны " + a);
        }


    }
}