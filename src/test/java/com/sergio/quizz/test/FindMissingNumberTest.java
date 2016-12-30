package com.sergio.quizz.test;

import com.sergio.quizz.missingnumber.FindMissingNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sergio on 12/29/16.
 */
public class FindMissingNumberTest {

    int[] incompleteArray = {1, 2, 3, 4, 5, 6, 8, 9, 10};
    int expectedMissingNumber = 7;

    @Test
    public void shouldReturnMissingNumber_SumTechnique(){

        int actualMissingNumber = FindMissingNumber.sumTechnique(incompleteArray);

        Assert.assertEquals(expectedMissingNumber,actualMissingNumber);
    }

    @Test
    public void shouldReturnMissingNumber_SequentialSearchTechnique(){

        int actualMissingNumber = FindMissingNumber.sequentialSearchTechnique(incompleteArray);

        Assert.assertEquals(expectedMissingNumber, actualMissingNumber);
    }

    @Test
    public void shouldReturnMissingNumber_MappingTechnique(){

        int actualMissingNumber = FindMissingNumber.mappingTechnique(incompleteArray);

        Assert.assertEquals(expectedMissingNumber, actualMissingNumber);

    }

    @Test
    public void shouldReturnMissingNumber_DivideAndSearchTechnique(){

        int actualMissingNumber = FindMissingNumber.findMissing4(incompleteArray, 0, incompleteArray.length-1);

        Assert.assertEquals(expectedMissingNumber, actualMissingNumber);

    }


}
