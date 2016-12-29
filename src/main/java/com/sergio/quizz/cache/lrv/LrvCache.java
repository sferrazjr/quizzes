package com.sergio.quizz.cache.lrv;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by barcelona on 22/11/16.
 *
 * Sergio´s email: sferrazjr@gmail.com
 */
public class LrvCache {

    private int MAX_SIZE = 3;

    private LinkedList<LrvElement> cacheList = new LinkedList<LrvElement>();

    public void set(String a, int i) {

        if(cacheList.size()==MAX_SIZE){
            cacheList.removeLast();
        }

        cacheList.addFirst(new LrvElement(a, i));

    }


    public int get(String a) {
        int indx = cacheList.indexOf(new LrvElement(a, null));
        LrvElement lrvElement = cacheList.get(indx);
        cacheList.remove(indx);
        cacheList.addFirst(lrvElement);
        return lrvElement.getValue();
    }

    public void print() {
        cacheList.forEach( e -> System.out.print(e+ " "));
    }


    public LinkedList<LrvElement> getCacheList() {
        return cacheList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LrvCache lrvCache = (LrvCache) o;
        return MAX_SIZE == lrvCache.MAX_SIZE &&
                Objects.equals(cacheList, lrvCache.cacheList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MAX_SIZE, cacheList);
    }
}
