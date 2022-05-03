package com.core.head.model.strategy.behavior.impl.quack;

import com.core.head.model.strategy.behavior.QuackBehavior;

/**
 * 吱吱叫的鸭子
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}
