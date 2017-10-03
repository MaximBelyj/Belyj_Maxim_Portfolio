package net.testingbehavior.behaviorImpl;

import net.testingbehavior.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
