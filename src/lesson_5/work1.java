package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class work1 {

    public static void main(String[] args) {
  //      1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив. Для считывания строк используй у сканера метод nextLine()
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


        Scanner scanner = new Scanner(System.in);

        String[] lines = new String[10];

        for (int i = 2; i < lines.length; i++) {
            lines[i] = scanner.nextLine();              //Циклы надо разделять!!!ЗАПОМНИТЬ!!!
        }
        for (int i = lines.length - 1; i >= 0 ; i--) { //вывод информации в обратном порядке
            System.out.println(lines[i]);
        }

    }
}
