package net.testingbehavior;

import net.testingbehavior.behaviorImpl.FlyRocketPowered;
import net.testingbehavior.ducks.Duck;
import net.testingbehavior.ducks.MallardDuck;
import net.testingbehavior.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("\n");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
