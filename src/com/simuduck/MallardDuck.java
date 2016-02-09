package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Quack(), new Fly());
    }

    @Override
    public void display() {
        System.out.println("display");
    }


}
