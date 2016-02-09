package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new Quack(), new Fly());
    }

    @Override
    public String display() {
        final String display = "Red Head Duck";
        System.out.println(display);
        return display;
    }


}
