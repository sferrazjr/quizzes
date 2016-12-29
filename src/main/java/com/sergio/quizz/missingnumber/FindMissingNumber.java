package com.sergio.quizz.missingnumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        System.out.println("findMissing1 -> " + findMissing1(a, 10));
        System.out.println("findMissing2 -> " + findMissing2(a));
        System.out.println("findMissing3 -> " + findMissing3(a));
        System.out.println("findMissing4 -> " + findMissing4(a, 0, (a.length - 1)));
    }

    /**
     * O(n) as we need to "sum" all the elements
     */
    public static int findMissing1(int[] a, int max) {
        // calculate the sum considering we have all elements
        int sumTotal = (max * (max + 1)) / 2;

        // calculate the sum of all elements we have in the array
        int sumArray = Arrays.stream(a).sum();

        // the difference will be the missing number
        return (sumTotal - sumArray);
    }

    /**
     * O(n) as in the worst case we need to transverse all the array
     */
    public static int findMissing2(int[] a) {
        // iterate over the list and compare if it is sequential, otherwise return the missing value
        for (int i = 1; i <= a.length; i++) {
            if (a[i - 1] != i) {
                return i;
            }
        }
        return 0;
    }

    /**
     * O(n) as we need to transverse the array to get the flags
     */
    public static int findMissing3(int[] a) {
        // put all the possible numbers in a Map with a flag set as false
        Map<Integer, Boolean> values = new HashMap<>();
        IntStream.range(1, (a.length + 1)).forEach(i -> values.put(i, false) );

        // iterate over the array and mark the items's flag as true
        IntStream.range(0, a.length).forEach(i -> values.put(a[i], true) );

        // the items with flag false are the missing one
        for (Map.Entry<Integer, Boolean> entry: values.entrySet()) {
            if (entry.getValue().equals(false)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    /**
     * O(log n) as we do a recursive call and ignore half of the array each time
     */
    public static int findMissing4(int[] a, int left, int right) {
        // find the missing number
        if (left == (right - 1)) {
            return a[right] - 1;
        }

        // get the middle index
        int middleIndex = left + (right - left) / 2;

        // get the average value
        int middleValue = a[left] + (a[right] - a[left]) / 2;

        // get the remainder in case of odd/even middleIndex
        int remainder = (right - left) % 2;

        // if the middleIndex contains the average means that the array until this position is ok, so we check from middle and onwards
        if (a[middleIndex] == (middleValue - remainder)) {
            return findMissing4(a, middleIndex, right);
        }
        // otherwise means that the missing number is before that, so we check from the middle and backwards
        else {
            return findMissing4(a, left, middleIndex);
        }
    }

}