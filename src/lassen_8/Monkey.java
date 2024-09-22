package lassen_8;

public class Monkey  implements Animal{


    @Override
    public void walk() {
        System.out.println(" Хожу на ногах ");
    }

    @Override
    public void breathe() {
        System.out.println(" Задерживает дыхание на 30 секунд ");

    }
}
