package _28102022;

import java.util.Random;

public class Test {

    public static int[] getRandom(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(50);
            //new Random().nextInt(50); = это число
        }
        return array;
    }

    public static int[] getRandomSvitlana(int[] arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        getRandomSvitlana(arr);


    }
}
