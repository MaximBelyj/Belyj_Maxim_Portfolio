package net.testingbehavior.behaviorImpl;

import net.testingbehavior.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
