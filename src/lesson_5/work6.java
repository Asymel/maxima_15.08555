package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class work6 {

    public static void main(String[] args) {
//        Создать массив на 20 чисел.
//                Заполнить его числами с клавиатуры.
//        Найти максимальное и минимальное числа в массиве.
//                Вывести на экран максимальное и минимальное числа через пробел.

        Scanner scanner = new Scanner(System.in);
        int[] twentyNumbers = new int[20];

        for (int i = 0; i < twentyNumbers.length; i++) {
            twentyNumbers[i] = scanner.nextInt();
        }
        int minNumbers = twentyNumbers[0];
        int maxNumders = twentyNumbers[0];

        for (int i = 0; i < twentyNumbers.length; i++) {
            if (twentyNumbers[i] > maxNumders) {
                maxNumders = twentyNumbers[i];
            }
        }

            for (int j = 0; j < twentyNumbers.length; j++) {
                if (twentyNumbers[j] < minNumbers) {
                    minNumbers = twentyNumbers[j];
                }
            }
        System.out.println(maxNumders + " " + minNumbers);

    }
}
