package com.dsa.arrays.medium;

/*
TC -> O(N)
SC -> O(1)
 */
public class MissingNumber {

    static int missingNumber(int[] arr, int n) {
        int range = n + 1;
        int sum = range * (range + 1) / 2;
        int sumOfAllElements = 0;
        for (int i = 0; i < n; i++) {
            sumOfAllElements = sumOfAllElements + arr[i];
        }
        int missNumber = sum - sumOfAllElements;
        return missNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 3, 7, 8};
        int n = numbers.length;
        int result = missingNumber(numbers, n);

        System.out.println(result);

    }
}
