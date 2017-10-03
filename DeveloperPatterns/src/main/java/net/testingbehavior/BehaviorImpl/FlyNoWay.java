package net.testingbehavior.behaviorImpl;

import net.testingbehavior.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
