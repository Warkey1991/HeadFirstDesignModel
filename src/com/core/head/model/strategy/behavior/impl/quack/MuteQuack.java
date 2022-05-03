package com.core.head.model.strategy.behavior.impl.quack;

import com.core.head.model.strategy.behavior.QuackBehavior;

/**
 * 不会叫的鸭子
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫的鸭子");
    }
}
