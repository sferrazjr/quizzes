package com.sergio.quizz.cache.lrv;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Sergio on 22/11/16.
 *
 * Sergio´s email: sferrazjr@gmail.com
 */
public class LrvCacheNoOrdering {

    private int MAX_SIZE = 3;

    private Map<String, Integer> internalCache = new LinkedHashMap<String, Integer>(MAX_SIZE, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > MAX_SIZE;
        }

    };


    public void set(String a, int i) {
        internalCache.put(a, i);

    }

    public void print() {
        internalCache.forEach((k, v)->System.out.print(k + "=" + v + " "));
    }

    public int get(String b) {
        return internalCache.get(b);
    }

    public Map<String, Integer> getInternalCache() {
        return internalCache;
    }
}
