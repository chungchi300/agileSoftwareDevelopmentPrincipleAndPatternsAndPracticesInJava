package com.learning.avoidNestingForLoop;

/**
 * Created by Administrator on 2015/8/5.
 */
public class BallColorStats {
    private String color;
    private int quantity=0;
    private double weight = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void incrementQuantity(){
            this.quantity++;
    }
    public double getWeight() {
        return weight;
    }
    public void addWeight(double weight){
        this.weight += weight;
    }

    public int getQuantity() {
        return quantity;
    }
}
