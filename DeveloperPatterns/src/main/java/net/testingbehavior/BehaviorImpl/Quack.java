package net.testingbehavior.BehaviorImpl;

import net.testingbehavior.Behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}
