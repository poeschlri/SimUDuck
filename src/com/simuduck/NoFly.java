package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("-");
    }
}
