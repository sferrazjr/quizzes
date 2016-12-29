package com.sergio.quizz.cache.lrv;

/**
 * Created by Sergio on 22/11/16.
 *
 * Sergio´s email: sferrazjr@gmail.com
 */
public class Cache {


    public static void main(String args[]) {

        doCacheNoOrdering();

        doCacheOrdering();


    }

    private static void doCacheNoOrdering() {

        System.out.println("Caching using LinkedHasMap. The first element is the last read.");

        LrvCacheNoOrdering lrvCacheNoOrdering = new LrvCacheNoOrdering();

        lrvCacheNoOrdering.set("A",1);
        lrvCacheNoOrdering.set("B",2);
        lrvCacheNoOrdering.set("C",3);

        lrvCacheNoOrdering.print();
        System.out.println();

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

    private static void doCacheOrdering() {
        System.out.println("Caching using LinkedList. The first element is the first read.");

        LrvCache lrvCache = new LrvCache();

        lrvCache.set("A",1);
        lrvCache.set("B",2);
        lrvCache.set("C",3);

        lrvCache.print();
        System.out.println();

        lrvCache.set("D",4);

        lrvCache.print();
        System.out.println();

        System.out.println("Reading B.");
        lrvCache.get("B");

        lrvCache.print();
        System.out.println();

        lrvCache.set("E",5);

        lrvCache.print();
        System.out.println();

        System.out.println("Changing D value from 4 to 8.");
        lrvCache.set("D",8);

        lrvCache.print();
        System.out.println();
    }


}
