package com.amey.problems;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSumMethod(int[] arr, int target) {
        Arrays.sort(arr);
        int[] returnArr = new int[2];
        int left = 0, right = arr.length - 1;

        // Iterate while left pointer is less than right
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum matches the target
            if (sum == target){
                returnArr[0] = arr[left];
                returnArr[1] = arr[right];
                return returnArr;
            }
            else if (sum < target)

                // Move left pointer to the right
                left++;
            else

                // Move right pointer to the left
                right--;
        }
        // If no pair is found
        return returnArr;
    }

    public static void main(String[] args){
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        int[] result = new TwoSum().twoSumMethod(arr, target);
        Arrays.stream(result).forEach(p -> System.out.print(p+ " "));
    }
}
