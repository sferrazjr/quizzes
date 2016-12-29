package com.sergio.quizz.test;

import com.sergio.quizz.draw.XmasTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sergio on 12/18/16.
 */
public class XmasTreeTest {

    @Test
    public void shouldReturnValidTree(){

        String validReturn = ("...*...\n..***..\n.*****.\n*******");

        XmasTree xmasTree = new XmasTree();

        String myTree = xmasTree.create(4);


        Assert.assertEquals(validReturn.toString(), myTree.toString());

    }


}
