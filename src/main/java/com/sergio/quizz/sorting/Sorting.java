package com.sergio.quizz.sorting;

import java.util.Arrays;

public class Sorting {

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    swap(a, i, j);
                }
            }

            printArray(a);
        }

        return a;
    }

    public static void swap(int[] a, int i, int j) {
        a[i] = a[i] + a[j];
        a[j] = a[i] - a[j];
        a[i] = a[i] - a[j];
    }

    public static void printArray(int[] a) {
        Arrays.stream(a).forEach(v -> System.out.print(v + " "));
        System.out.println();
    }

}