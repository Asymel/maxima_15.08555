package lesson_4;
import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        // Ввести с клавиатуры строку name.
//                Ввести с клавиатуры дату рождения (три числа): y, m, d.
//
//
//                Вывести на экран текст:
//        "Меня зовут name.
//        Я родился d.m.y"
//
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свое имя:");
        String name = scanner.next();
        System.out.print("Введите дату рождения: ");
        String dateOfBirth = scanner.next();
        {
            System.out.println("Меня зовут: " + name);
            System.out.println("Я родился: " + dateOfBirth);
        }
    }
}
