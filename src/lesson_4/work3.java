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
        System.out.println("Введите три числа, чтобы найти среднее из них. При равных числах будет выведено любое из них"); // Добавил интерактива в консоль//
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int averageNumber = 0;
        if (a > b && a < c || a < b && a > c) {
            averageNumber = a;
        }
        if (b > a && b < c || b < a && b > c) {
            averageNumber = b;
        }
        if (c > b && c < a || c < b && c > a) {
            averageNumber = c;
        }
        if (c == b && c == a) {
            averageNumber = c;
        }
        System.out.print(averageNumber);

    }

}





