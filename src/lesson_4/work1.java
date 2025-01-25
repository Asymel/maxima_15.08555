package lesson_4;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {

//
//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("8"); // Данная команда не переводит курсор на следующую сроку!!! Надо запоминать!!!
            }
            System.out.println(" ");
        }
    }
}