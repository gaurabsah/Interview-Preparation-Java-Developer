package com.dsa.arrays.medium;


public class SearchInRotatedArray2 {

    static boolean searchRotatedArray(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return true;
            }

            if (array[start] == array[mid] && array[mid] == array[end]) {
                start++;
                end--;
                continue;
            }

            if (array[start] <= array[mid]) {
                if (array[start] <= target && target <= array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (array[mid] <= target && target <= array[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 0, 0, 1, 2};
        int n = array.length;
        int target = 3;

        boolean result = searchRotatedArray(array, target);

        if (result) {
            System.out.println("Present in array");
        } else {
            System.out.println("Not Present in array");
        }

    }
}

