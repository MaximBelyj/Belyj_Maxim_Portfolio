package net.testingbehavior.ducks;

import net.testingbehavior.behaviorImpl.FlyWithWings;
import net.testingbehavior.behaviorImpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
