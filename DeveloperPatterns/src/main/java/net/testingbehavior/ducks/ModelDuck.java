package net.testingbehavior.ducks;

import net.testingbehavior.behaviorImpl.FlyNoWay;
import net.testingbehavior.behaviorImpl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
