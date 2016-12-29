package com.sergio.quizz.test;

import com.sergio.quizz.missingnumber.FindMissingNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sergio on 12/29/16.
 */
public class FindMissingNumberTest {

    int[] incompleArray = {1, 2, 3, 4, 5, 6, 8, 9, 10};
    int expectedMissingNumber = 7;

    @Test
    public void shouldReturnMissingNumber_SumTechnique(){

        int actualMissingNumber = FindMissingNumber.findMissing1(incompleArray, 10);

        Assert.assertEquals(expectedMissingNumber,actualMissingNumber);


    }


}
