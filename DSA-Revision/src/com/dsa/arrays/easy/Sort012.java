package com.dsa.arrays.easy;

import java.util.Arrays;

/*
Dutch National Flag problem
TC -> O(N)
SC -> O(1)
 */
public class Sort012 {

    static void sort0s1s2s(int[] a, int n) {
        int start = 0;
        int mid = 0;
        int end = n - 1;
        int temp = 0;

        while (mid <= end) {

            if (a[mid] == 0) {
                temp = a[start];
                a[start] = a[mid];
                a[mid] = temp;
                start++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                temp = a[mid];
                a[mid] = a[end];
                a[end] = temp;
                end--;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = array.length;

        sort0s1s2s(array,n);

        System.out.println(Arrays.toString(array));
    }
}
