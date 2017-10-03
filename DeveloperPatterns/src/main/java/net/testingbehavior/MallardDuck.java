package net.testingbehavior;

import net.testingbehavior.BehaviorImpl.FlyWithWings;
import net.testingbehavior.BehaviorImpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
