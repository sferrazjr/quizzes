package com.sergio.quizz.test;

import com.sergio.quizz.cache.lrv.LrvCacheNoOrdering;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * Created by sergio on 12/18/16.
 */
public class CacheTest {

    @Test
    public void shouldReturnLRVCacheWithOutSorting(){

        System.out.println("Caching using LinkedHasMap. The first element is the last read.");

        LrvCacheNoOrdering lrvCacheNoOrdering = new LrvCacheNoOrdering();

        lrvCacheNoOrdering.set("A",1);
        lrvCacheNoOrdering.set("B",2);
        lrvCacheNoOrdering.set("C",3);

        lrvCacheNoOrdering.print();
        System.out.println();

        LinkedHashMap<String, Integer> expectedCache = new LinkedHashMap<String, Integer>();
        expectedCache.put("A",1);
        expectedCache.put("B",2);
        expectedCache.put("C",3);

        Assert.assertEquals(lrvCacheNoOrdering.getInternalCache(), expectedCache);

        lrvCacheNoOrdering.set("D",4);

        lrvCacheNoOrdering.print();
        System.out.println();

        System.out.println("Reading B.");
        lrvCacheNoOrdering.get("B");

        lrvCacheNoOrdering.print();
        System.out.println();

        lrvCacheNoOrdering.set("E",5);

        lrvCacheNoOrdering.print();
        System.out.println();

        System.out.println("Changing D value from 4 to 8.");
        lrvCacheNoOrdering.set("D",8);

        lrvCacheNoOrdering.print();
        System.out.println();

    }



}
