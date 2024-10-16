package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class HM5 {
    public static void main(String[] args) {


//        1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив. Для считывания строк используй у сканера метод nextLine()
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


//        Scanner scanner = new Scanner(System.in);
//
//        String[] lines = new String[10];
//
//        for (int i = 2; i < lines.length; i++) {
//            lines[i] = scanner.nextLine();              //Циклы надо разделять!!!ЗАПОМНИТЬ!!!
//        }
//        for (int i = lines.length - 1; i >= 0 ; i--) { //вывод информации в обратном порядке
//            System.out.println(lines[i]);
//        }

////        2
////
////
////        1.1. Создай массив на 10 чисел
////        1.2. Считай с консоли 10 чисел и заполни ими массив
////        2. Найти максимальное число из элементов массива
//
//        System.out.println("Введите 10 чисел для определения большего из них");
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[10];
//        int maxNumbers = numbers[0];
//        for (int i = ; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > maxNumbers) {
//                maxNumbers = numbers[i];
//            }
//        }
//        System.out.println("Наибольшее число " + maxNumbers);


//        3
//
//
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк,
//                индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//                Для нахождения длины строки используй у конкретного слова вызов метода length()


//        System.out.println("Заполните 10 строк символами." +
//                " При заполнение программа посчитает количество символов в каждой строке. ");
//        Scanner scanner = new Scanner(System.in);
//        String[] lines2 = new String[10];
//        int[] numbers2 = new int[10];
//        for (int i = 0; i < lines2.length; i++) {
//            lines2[i] = scanner.nextLine();
//            numbers2[i] = lines2[i].length();
//        }
//        for (int i = 0; i < numbers2.length; i++) {
//            System.out.println(numbers2[i]);
//
//
//        }


//        4
//
//        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

//        Scanner scanner = new Scanner(System.in);
//        int [] tenNumbers = new int[10];
//        for (int i = 0; i < tenNumbers.length; i++) {
//            tenNumbers[i] = scanner.nextInt();
//        }
//        for (int i = tenNumbers.length - 1; i >= 0 ; i--) {
//
//        System.out.println(tenNumbers[i]);}


//        5
//
//
//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


//        Scanner scanner = new Scanner(System.in);
//        int [] bigArray = new int [20];
//        int [] minArray1 = new int [10];
//        int [] minArray2 = new int [10];
//        for (int i = 0; i < bigArray.length; i++) {
//            bigArray[i] = scanner.nextInt();
//        }
//        minArray1 = Arrays.copyOfRange( bigArray, 0 , 9 ); //Искал способ решения через копирование как и описано в задание,данный метод копирует из массива данные с указание ячеек из которых надо скопировать
//        minArray2 = Arrays.copyOfRange( bigArray, 10, 20);
//        for (int i = 0; i < minArray2.length; i++) {
//            System.out.println(minArray2[i]);
//
//        }

//        6
//
//
//        Создать массив на 20 чисел.
//                Заполнить его числами с клавиатуры.
//        Найти максимальное и минимальное числа в массиве.
//                Вывести на экран максимальное и минимальное числа через пробел.

//        Scanner scanner = new Scanner(System.in);
//        int[] twentyNumbers = new int[20];
//
//        for (int i = 0; i < twentyNumbers.length; i++) {
//            twentyNumbers[i] = scanner.nextInt();
//        }
//        int minNumbers = twentyNumbers[0];
//        int maxNumders = twentyNumbers[0];
//
//        for (int i = 0; i < twentyNumbers.length; i++) {
//            if (twentyNumbers[i] > maxNumders) {
//                maxNumders = twentyNumbers[i];
//            }
//        }
//
//            for (int j = 0; j < twentyNumbers.length; j++) {
//                if (twentyNumbers[j] < minNumbers) {
//                    minNumbers = twentyNumbers[j];
//                }
//            }
//        System.out.println(maxNumders + " " + minNumbers);


//        7
//
//
//        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

//            В этой задаче надо сделать ввод с клавиатуры от пользователя или чтобы программа рандомно выводила нужное кол-во чисел и выстраивало их в убывающем порядке?


        }
    }















        







