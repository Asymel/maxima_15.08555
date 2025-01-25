package lesson_4;

import java.util.Scanner;

public class work4 {

    public static void main(String[] args) {
        //  Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//                -1 должно учитываться в сумме.
//
//
//        Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//
//
//        while (true) {
//            int number = считываем число;
//            if (проверяем, что number -1)
//            break;
//        }
//
//
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int numder = scanner.nextInt();
            sum += numder; //эквивалент sum = sum + numder
            if (numder == -1) {
                break;
            }
        }
        System.out.println(sum);        //       Справился с этой задачей посмотрев консультацию. Оказалось просто, но надо было понять как складывать числа до условия

    }
}
