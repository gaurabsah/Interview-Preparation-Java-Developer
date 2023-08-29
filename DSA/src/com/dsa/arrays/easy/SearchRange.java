package com.dsa.arrays.easy;

import java.util.Arrays;

public class SearchRange {

    static int[] searchRange(int[] arr, int key) {
        // add your logic here

        int[] nums = new int[2];

        nums[0] = first(arr, key);
        nums[1] = last(arr, key);

        return nums;

    }

    static int first(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;
    }

    static int last(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = searchRange(arr, target);

        System.out.println(Arrays.toString(ans));
    }
}
