package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Quack(), new Fly());
    }

    @Override
    public String display() {
        final String display = "Mallard Duck";
        System.out.println(display);
        return display;
    }


}
