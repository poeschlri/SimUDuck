package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public abstract class Duck {
    private final QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    //dependency injection
    public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    //???
    public String quack() {
        final String quack = quackBehaviour.quack();
        System.out.println(quack);
        return quack;
    }

    public void swim() {
        System.out.println("swim");

    }


    public String fly() {
        final String fly = flyBehaviour.fly();
        System.out.println(fly);
        return fly;
    }

    public abstract void display();

}
