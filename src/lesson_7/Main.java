package lesson_7;

public class Main {

    public static void main(String[] args) {

//        Cat noNameCat = new Cat();
//
//        Cat cat = new Cat("Sherlock");
//
//        Cat cat3 = new Cat(5);
//
//        Cat begemoth = new Cat(500, "Begemoth");
//
//        System.out.println(cat3.getAge());
//
//        System.out.println(cat.getName());

//        cat.setAge(12);
//        cat.setName("Sherlock");

//        cat.name = "Dvornyaga";  //некорректное введение
//        cat.age = 10;

//        System.out.println(cat3.getAge());
//        System.out.println(cat.getName());

        Flat modernFlat = new Flat(180);
        System.out.println(modernFlat.getSquare());



        Flat dreamFlat = new Flat(200,50000);

        dreamFlat.setCost(50000);
        dreamFlat.setSquare(200);
        dreamFlat.setDistrict("Kazan");

        System.out.println(dreamFlat.getCost());
        System.out.println(dreamFlat.getSquare());
        System.out.println(dreamFlat.getDistrict());



    }
}
