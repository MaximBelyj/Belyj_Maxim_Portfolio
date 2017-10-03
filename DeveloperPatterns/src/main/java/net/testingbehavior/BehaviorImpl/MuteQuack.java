package net.testingbehavior.BehaviorImpl;

import net.testingbehavior.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
