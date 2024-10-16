package lesson_4;


import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {

//        1
//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

//        Scanner scanner = new Scanner(System.in);
//             int m = scanner.nextInt();
//             int n = scanner.nextInt();
//
//             for (int i = 0; i < n; i ++) {
//                 for (int j = 0; j < m ; j++) {
//                     System.out.print("8"); // Данная команда не переводит курсор на следующую сроку!!! Надо запоминать!!!
//                 }
//                 System.out.println(" ");
//             }

//        2
//        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.


//

//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(8); // Данная команда не переводит курсор на следующую сроку!!! Надо запоминать!!!
//            }
//            System.out.println();
//
//        }


//      3
//      Ввести с клавиатуры три числа, вывести на экран среднее из них.
//                То есть не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите три числа, чтобы найти среднее из них. При равных числах будет выведено соответствующее сообщение"); // Добавил интерактива в консоль//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//
//        for (int i = a; i > b && i < c; i = 0){
//            System.out.println(a + " среднее число");}
//        if (a > c && a < b){
//            System.out.println(a + " среднее число");}
//        for (int i = b; i > a && i < c; i = 0){
//            System.out.println(b + " среднее число");}
//        if (b < a && b > c){
//            System.out.println(b + " среднее число");}
//        for (int i = c; i < a && i > b; i = 0){
//            System.out.println(c + " среднее число");}
//        if (c > a && c < b){
//            System.out.println(c + " среднее число");}
//        if (a == b && a == c){
//            System.out.println(" Заданные числа равны " + a );}


//       4
//
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


//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        while (true) {
//            int numder = scanner.nextInt();
//            sum += numder; //эквивалент sum = sum + numder
//            if (numder == -1) {
//                break;
//            }
//        }
//        System.out.println(sum);
//        Справился с этой задачей посмотрев консультацию. Оказалось просто, но надо было понять как складывать числа до условия


//        5
//        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.

//        int a = 1;
//        int b = 1;
//        while (a <= 10) {
//            System.out.print(a + " ");
//            while (b <= 9) {
//
//                b++;
//                System.out.print(a * b + " ");
//
//            }
//            a++;
//            b = 1;
//            System.out.println(" ");
//        }


////        6
////        Ввести с клавиатуры строку name.
////                Ввести с клавиатуры дату рождения (три числа): y, m, d.
////
////
////                Вывести на экран текст:
////        "Меня зовут name.
////        Я родился d.m.y"
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите свое имя:");
//        String name = scanner.next();
//        System.out.print("Введите дату рождения: ");
//        String dateOfBirth = scanner.next();
//        {
//            System.out.println("Меня зовут " + name);
//            System.out.println("Я родился " + dateOfBirth);
//
//        }



        }


    }










































