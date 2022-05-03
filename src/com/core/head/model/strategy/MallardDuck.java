package com.core.head.model.strategy;

import com.core.head.model.strategy.base.Duck;
import com.core.head.model.strategy.behavior.impl.fly.FlyWithWings;
import com.core.head.model.strategy.behavior.impl.quack.Quack;

/**
 * 绿头鸭 需要继承Duck 基类
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //使用FlyWithWings 类处理飞行的行为，所以当调用performFly 方法时，
        // 叫的职责委托给了FlyWithWings对象，而我们得到了真正的飞行行为
        flyBehavior = new FlyWithWings();

        //使用Quack 类处理呱呱叫的行为，所以当调用performQuack 方法时，
        // 叫的职责委托给了Quack对象，而我们得到了真正的呱呱叫
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只真正的绿头鸭");
    }
}
