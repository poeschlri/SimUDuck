package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class RubberDuck extends Duck {


    public RubberDuck() {
        super(new Squeak(), new NoFly());
    }

    @Override
    public String display() {
        final String display = "Rubber Duck";
        System.out.println(display);
        return display;
    }



}
