package com.amey.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayByNPosition {

    static void main(String[] args) {

        int[] arr = {1,2,3,4,6,5,7}; // -> by 3 position = 6 5 7 1 2 3 4
        int N = 3; //positions

        N = N % arr.length;

        reverse(arr, 0 , arr.length-1);
        reverse(arr, 0 , N-1);
        reverse(arr, N , arr.length-1);

        Arrays.stream(arr).forEach(p -> System.out.print(p + " "));

    }

    public static int[]  reverse(int[] arr, int startIndex, int lastIndex){

        while(startIndex<lastIndex){

            int temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex++;
            lastIndex--;

        }

        return arr;


    }




}
