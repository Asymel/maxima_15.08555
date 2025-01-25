package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class work4 {

    public static void main(String[] args) {
        //        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

        Scanner scanner = new Scanner(System.in);
        int [] tenNumbers = new int[10];
        for (int i = 0; i < tenNumbers.length; i++) {
            tenNumbers[i] = scanner.nextInt();
        }
        for (int i = tenNumbers.length - 1; i >= 0 ; i--) {

        System.out.println(tenNumbers[i]);
        }

    }
}
