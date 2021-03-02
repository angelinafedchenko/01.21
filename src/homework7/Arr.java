package homework7;

import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {
        Object[]arrayObject = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arrayObject.length; i++) {
            System.out.print(arrayObject[i] + " ");
        }

        System.out.println();
        System.out.println("---------------");

        arrayObject[4] = "Five";
        for (int i = 0; i < arrayObject.length; i++) {
            if (i != 6)
            System.out.print(arrayObject[i] + " ");
        }

        System.out.println();
        System.out.println("---------------");

        //reverse Array

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Reverse array");

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

}
