package com.amey.problems;

import java.util.Arrays;

public class ArrayReverse {

    static void main() {

        //int[] arr = new int[];
        int[] arr = {1,2,3,4,6,5,7,8,9};
        Arrays.stream(arr).forEach(System.out::print);

        for(int i = 0; i< arr.length / 2; i++){

            int temp = arr[i];
            arr[i] = arr[(arr.length - 1)  - i];
            arr[(arr.length - 1) - i] = temp;


        }
        System.out.println("\nAfter Reverse");
        Arrays.stream(arr).forEach(System.out::print);

    }
}
