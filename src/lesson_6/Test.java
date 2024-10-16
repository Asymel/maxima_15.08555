package lesson_6;

public class Test {


    public static void main(String[] args) {
        int a = 5;

        Cat cat = new Cat();

        cat.nameThisCat();
        cat.moew();
        cat.Name();

        int smartCatNumber = cat.countDifficultNumbers(218, 691);
        System.out.println(smartCatNumber);
    }
}
