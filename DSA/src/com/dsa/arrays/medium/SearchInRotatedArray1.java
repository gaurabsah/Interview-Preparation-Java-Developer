package com.dsa.arrays.medium;

public class SearchInRotatedArray1 {

    static int searchRotatedArray(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
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
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 1, 2, 3, 4, 5, 6};
        int n = array.length;
        int target = 7;

        int index = searchRotatedArray(array, target);

        System.out.println(index);

    }
}
