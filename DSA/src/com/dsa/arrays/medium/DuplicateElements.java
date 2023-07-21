package com.dsa.arrays.medium;

import java.util.ArrayList;
import java.util.List;

/*
TC -> O(N)
SC -> O(1)
 */
public class DuplicateElements {

    static ArrayList<Integer> findDuplicateElements(int[] arr, int n) {
        ArrayList<Integer> dup = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dup.add(arr[i]);
                }
            }
        }

        if (dup.isEmpty()) {
            dup.add(-1);
        }


        return dup;
    }

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 6, 3, 6, 1};
        int n = elements.length;

        List<Integer> duplicates = findDuplicateElements(elements, n);

        for (Integer i : duplicates) {
            System.out.println(i);
        }
    }
}
