package Lesson4;

import java.util.Random;

public class MassiveArray1 {
    public static void main(String[] args) {

        int arr[] = new int[10];
//        Random rand = new Random(10);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        for (int element : arr) {
            System.out.println(element);
        }

//ищем максимальное число в массиве
        int max = 0; //переменная для содержания max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; //записываем макс число в max...
            }
        }
        System.out.println("max = " + max);

        //ищем минимальное число в массиве
        int min = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];//записываем мин число в min...
            }
        }
        System.out.println("min = " + min);


//        int max = arr[0];
//        int maxIndex =0;
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] > max){
//                max=arr[index];
//                maxIndex=index;
//            }
//        }
//        for (int index = maxIndex; index < arr.length; index++) {
//            System.out.println("max Inxed? " + arr[index]);
//
//        }

//        int min = Arrays.stream(arr).min().getAsInt();
//        int max = Arrays.stream(arr).max().getAsInt();
//        System.out.println("Min = " + min);
//        System.out.println("Max = " + max);
    }

}


