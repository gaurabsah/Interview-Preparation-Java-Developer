package com.dsa.arrays.easy;

// INCOMPLETE
class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class SubarrayWithSum {

    static pair subarraySum(int[] array, int n, int sum) {
        int i = 0;
        int j = 0;
        int currentSum = 0;
        for ( i = 0; i < n; i++) {
            if (currentSum < sum) {
                currentSum += array[i];
            } else if (currentSum > sum) {
                currentSum -= array[j];
                j++;
            } else
                break;
        }

        return new pair(i,j);
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 20, 3, 10, 5};
        int n = array.length;
        int sum = 33;

        pair result = subarraySum(array, n, sum);

        System.out.println(result.first+" "+ result.second);

    }
}
