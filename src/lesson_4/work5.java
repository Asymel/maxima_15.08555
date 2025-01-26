package lesson_4;

public class work5 {

    public static void main(String[] args) {
        //        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
//
        int a = 1;
        int b = 1;
        while (a <= 10) {

            while (b <= 9) {

                b++;
                System.out.print( a + " * " + b + " = ");
                System.out.println(a * b + " ");

            }
            a++;
            b = 1;
            System.out.println(" ");
        }

    }
}