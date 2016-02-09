package com.simuduck;

/**
 * Created by MacBookRP on 09.02.16.
 */
public abstract class Duck {
    private final QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }


    public void quack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("swim");

    }


    public void fly() {
        flyBehaviour.fly();
    }

    public abstract void display();

}
