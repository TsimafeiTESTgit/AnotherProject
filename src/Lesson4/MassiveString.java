package Lesson4;

import java.lang.reflect.Array;
import java.util.Random;

public class MassiveString {
    public static void main(String[] args) {
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            String strI = Integer.toString(new Random().nextInt(1000));
            System.out.println("string "+ strI);
            arr[i] = strI;
        }

    }

}

