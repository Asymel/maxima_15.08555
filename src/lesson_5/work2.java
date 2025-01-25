package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class work2 {

    public static void main(String[] args) {
//        1.1. Создай массив на 10 чисел
//        1.2. Считай с консоли 10 чисел и заполни ими массив
//        2. Найти максимальное число из элементов массива

        System.out.println("Введите 10 чисел для определения большего из них");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int maxNumbers = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumbers) {
                maxNumbers = numbers[i];
            }
        }
        System.out.println("Наибольшее число " + maxNumbers);

    }
}
