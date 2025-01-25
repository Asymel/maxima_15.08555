package lesson_4;

import java.util.Scanner;

public class work2 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8); // Данная команда не переводит курсор на следующую сроку!!! Надо запоминать!!!
            }
            System.out.println();

        }
    }
}
