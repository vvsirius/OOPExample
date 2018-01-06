package com.company;

public class Transport {
    static String name = "Transport";
    private int velocity;
    static{
        System.out.println("Static block!");
    }
    public Transport(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }
}
