package lesson_5;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class work5 {

    public static void main(String[] args) {
//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


        Scanner scanner = new Scanner(System.in);
        int [] bigArray = new int [20];
        int [] minArray1 = new int [10];
        int [] minArray2 = new int [10];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = scanner.nextInt();
        }
        minArray1 = Arrays.copyOfRange( bigArray, 0 , 9 ); //Искал способ решения через копирование как и описано в задание,данный метод копирует из массива данные с указание ячеек из которых надо скопировать
        minArray2 = Arrays.copyOfRange( bigArray, 10, 20);
        for (int i = 0; i < minArray2.length; i++) {
            System.out.println(minArray2[i]);

        }

    }
}
