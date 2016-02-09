package com.simuduck;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by MacBookRP on 09.02.16.
 */
public class DuckTest {
    @Test
    public void testMallardDuck() {
        MallardDuck mallardDuck = new MallardDuck();
        Assert.assertEquals("quack", mallardDuck.quack());
        Assert.assertEquals("fly", mallardDuck.fly());

    }

    @Test
    public void testRedHeadDuck() {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        Assert.assertEquals("quack", redHeadDuck.quack());
        Assert.assertEquals("fly", redHeadDuck.fly());
    }

    @Test
    public void testRubberDuck() {
        RubberDuck rubberDuck = new RubberDuck();
        Assert.assertEquals("squeak", rubberDuck.quack());
        Assert.assertEquals("-", rubberDuck.fly());
    }
}
