package com.dsa.arrays.easy;


public class OccurrenceElement {

    /*
    Linear Search
    TC -> O(N)
    SC -> O(1)
     */
    public static int getOccurrence(int[] array, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == k) count++;
        }
        return count;
    }

    /*
    Binary Search
    TC -> O(N)
    SC -> O(1)
 */
    public static int getOccurrenceNumber(int[] arr, int n, int x) {
        int first = firstOccurrence(arr, n, x);
        int last = lastOccurrence(arr, n, x);
        int result = last - first + 1;
        if (last == -1 || first == -1)
            return 0;

        return result;
    }

    static int firstOccurrence(int arr[], int n, int x) {
        int res = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                res = mid;//probably this will be but not sure so check in the left side
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    static int lastOccurrence(int arr[], int n, int x) {
        int res = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                res = mid;//probably this will be but not sure so check in the right side
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        int n = arr.length;
        int k = 2; // element

        int result = getOccurrenceNumber(arr, n, k);

        System.out.println("Element " + k + " occurred: " + result + " times");

    }
}
