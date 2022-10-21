package _21102022;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    private static int[] getArray(int[] array) {
        int[] arrayEx = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int a = new Random().nextInt(55);
            if(a % 2 != 0) {
                arrayEx[i] = a + 1;
            } else arrayEx[i] = a;
        }
        return arrayEx;
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Ex2.getArray(new int[new Random().nextInt(55)])));
        Random random = new Random();
        int rand = random.nextInt(55);
        int[] array = new int[rand];

        System.out.println(Arrays.toString(Ex2.getArray(array)));
    }
}