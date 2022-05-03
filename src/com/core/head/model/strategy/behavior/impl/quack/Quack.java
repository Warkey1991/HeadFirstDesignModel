package com.core.head.model.strategy.behavior.impl.quack;

import com.core.head.model.strategy.behavior.QuackBehavior;

/**
 * 真的呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫的鸭子");
    }
}
