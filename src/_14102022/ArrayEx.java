package _14102022;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx {
    int a = 0;
    static int[] array = new int[5];//[0 0 0 0 0]
    static int[] array1 = {65, 41, 23, 9, 87};

    public static void main(String[] args) {
//        System.out.println("Length ....." + array.length);
//        System.out.println(Arrays.toString(array));
//        array[0] = 21;
//        System.out.println("**************************");
//        System.out.println(Arrays.toString(array));
        int[] array22 = new int[11];//[_ _ _ _ _ _ _ _ _ _]
        int[] newArray = new int[array22.length];

        for (int i = 0; i < array22.length; i++) {
            array22[i] = new Random().nextInt(33);
        }
        System.out.println("Array22: " + Arrays.toString(array22));

        for (int i = 0; i < newArray.length; i++) {
            if(array22[i] % 2 == 0) {
                newArray[i] = array22[i];
            } else newArray[i] = 111;
        }
        System.out.println("newArray: " + Arrays.toString(newArray));
        System.out.println("/////////////////////////////////");
//[___________]
        for (int a : newArray) {
            System.out.println(a);
        }


    }
}