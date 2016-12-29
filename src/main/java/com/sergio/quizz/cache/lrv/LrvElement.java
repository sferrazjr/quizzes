package com.sergio.quizz.cache.lrv;

/**
 * Created by Sergio on 22/11/16.
 *
 * Sergio´s email: sferrazjr@gmail.com
 */
public class LrvElement {

    private String key;
    private Integer value;


    public LrvElement(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LrvElement that = (LrvElement) o;

        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
