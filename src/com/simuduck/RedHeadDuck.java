package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new Quack(), new Fly());
    }

    @Override
    public void display() {
        System.out.println("display");
    }


}
