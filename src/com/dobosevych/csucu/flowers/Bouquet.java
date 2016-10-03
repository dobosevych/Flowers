package com.dobosevych.csucu.flowers;

/**
 * Created by cs.ucu.edu.ua on 03-Oct-16.
 */
public class Bouquet {
    private int max = 16;

    private Flower[] flwrs = new Flower[max];

    private int lastIndex = 0;

    public void addFlower(Flower nw) {
        //if (lastIndex < max - 1) {}
        flwrs[lastIndex] = nw;
        lastIndex++;
    }
}
