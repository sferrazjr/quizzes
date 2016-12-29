package com.sergio.quizz.draw;

import java.util.stream.IntStream;

public class XmasTree {

    private String xmasTree = new String();

    public String create(int size) {


        IntStream.range(1, (size + 1)).forEach(line -> {
            int dots = 2 * line - 1;
            int blanks = size - line;
            IntStream.range(0, blanks).forEach(s -> xmasTree+=".");
            IntStream.range(0, dots).forEach(s -> xmasTree+="*");
            IntStream.range(0, blanks).forEach(s -> xmasTree+=".");
            if(line < size)
                xmasTree+="\n";
        });
        System.out.println(xmasTree);
        return  xmasTree;
    }


}