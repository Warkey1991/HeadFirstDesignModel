package com.core.head.model.strategy;

import com.core.head.model.strategy.DecoyDuck;
import com.core.head.model.strategy.RedheadDuck;
import com.core.head.model.strategy.RubberDuck;
import com.core.head.model.strategy.base.Duck;
import com.core.head.model.strategy.behavior.impl.fly.FlyNoWay;
import com.core.head.model.strategy.behavior.impl.fly.FlyRocketPowered;
import com.core.head.model.strategy.behavior.impl.fly.FlyWithWings;
import com.core.head.model.strategy.behavior.impl.quack.MuteQuack;
import com.core.head.model.strategy.behavior.impl.quack.Quack;
import com.core.head.model.strategy.behavior.impl.quack.Squeak;

public class DuckTestMain {
    public static void main(String[] args) {
        //测试红头鸭,可以飞行并且是呱呱叫
        Duck redHeadDuck = new RedheadDuck();
        redHeadDuck.setFlyBehavior(new FlyWithWings());
        redHeadDuck.setQuackBehavior(new Quack());
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.display();
        System.out.println("\n");

        //测试橡皮鸭不会飞吱吱叫
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.display();
        System.out.println("\n");

        //测试诱饵鸭 火箭作为动力飞，不会叫
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.setQuackBehavior(new MuteQuack());
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.display();
    }
}
