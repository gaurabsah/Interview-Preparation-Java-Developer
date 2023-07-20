package com.dsa.arrays.easy;

/*
TC -> 0( log N)
SC -> (1)

Peak element example :
1,34,12 -> 34 is peak element
 */


public class PeakElement {

    public static int getPeakElement(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
//            mid = (start + end) >> 1;

            // first case if mid is the answer
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                break;
            }
            // move the right pointer
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }
            // move the left pointer
            else {
                start = mid + 1;
            }
        }

        return arr[mid];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;

        int result = getPeakElement(arr, n);

        System.out.println(result);

    }
}
