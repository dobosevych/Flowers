package com.dobosevych.csucu.flowers;

/**
 * Created by cs.ucu.edu.ua on 03-Oct-16.
 */
public class Flower {
    protected double stemSize = 0;

    protected double price = 0;

    protected String color = "";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStemSize(double stemSize) {
        this.stemSize = stemSize;
    }

    public double getStemSize() {
        return stemSize;
    }
}
