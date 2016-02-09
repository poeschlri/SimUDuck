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
        Assert.assertEquals("swim", mallardDuck.swim());
        Assert.assertEquals("Mallard Duck", mallardDuck.display());

    }

    @Test
    public void testRedHeadDuck() {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        Assert.assertEquals("quack", redHeadDuck.quack());
        Assert.assertEquals("fly", redHeadDuck.fly());
        Assert.assertEquals("swim", redHeadDuck.swim());
        Assert.assertEquals("Red Head Duck", redHeadDuck.display());
    }

    @Test
    public void testRubberDuck() {
        RubberDuck rubberDuck = new RubberDuck();
        Assert.assertEquals("squeak", rubberDuck.quack());
        Assert.assertEquals("-", rubberDuck.fly());
        Assert.assertEquals("swim", rubberDuck.swim());
        Assert.assertEquals("Rubber Duck", rubberDuck.display());
    }
}
