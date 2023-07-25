package com.dsa.algorithms.searching;

/*
TC -> O(n)
SC -> O(1)
 */
public class LinearSearch {

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 67, 34, 88, 77, 12};
        int target = 34;

        int ans = search(arr, target);
        System.out.println(target + " is at " + ans + " index");
    }
}
