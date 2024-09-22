package lesson_5;

public class Main {
    public static void main(String[] args) {
        //array
        int [] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("End of program");

        //Print array
        // 1
//        int a1 = arr2[0];
//        System.out.println(a1); // и так далее!!! повтор присвоения

//      // 2

//        System.out.println( arr2[0]);
//        System.out.println( arr2[1]);
//        System.out.println( arr2[2]);
//        System.out.println( arr2[3]);
//        System.out.println( arr2[4]);
        // 3
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);

        }

        // 4

        int lengthOfArray = arr2.length;

        for (int i = 0; i < lengthOfArray; i++)
        {

        System.out.println(arr2[i]);

        }

        System.out.println("The length of array is " + lengthOfArray);

        //  5

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2.length);


        }


    }
}
