package com.sergio.quizz.test;

import com.sergio.quizz.sorting.Sorting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sergio on 12/18/16.
 */
public class SortingTest {

    @Test
    public void shouldReturnArraySorted(){

        int[] unSortedArray = new int[] { 5, 3, 2, 1, 4, 8, 6, 7, 9};

        Sorting.sort(unSortedArray);

        Assert.assertArrayEquals(unSortedArray, new int[] {1,2,3,4,5,6,7,8,9});

    }


}
