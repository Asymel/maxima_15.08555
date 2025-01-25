package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class work3 {

    public static void main(String[] args) {
        //        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк,
//                индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//                Для нахождения длины строки используй у конкретного слова вызов метода length()


        System.out.println("Заполните 10 строк символами." +
                " При заполнение программа посчитает количество символов в каждой строке. ");
        Scanner scanner = new Scanner(System.in);
        String[] lines2 = new String[10];
        int[] numbers2 = new int[10];
        for (int i = 0; i < lines2.length; i++) {
            lines2[i] = scanner.nextLine();
            numbers2[i] = lines2[i].length();
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);


        }

    }
}
