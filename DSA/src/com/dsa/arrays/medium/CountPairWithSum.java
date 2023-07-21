package com.dsa.arrays.medium;

import java.util.HashMap;

/*
TC -> O(N)
SC -> O(N)
 */
public class CountPairWithSum {

    static int getPairsCount(int arr[], int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (m.containsKey(k - arr[i])) {
                count += m.get(k - arr[i]);
            }
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1};
        int n = arr.length;
        int sum = 6;
        System.out.print("Count of pairs is "
                + getPairsCount(arr, n, sum));
    }
}
