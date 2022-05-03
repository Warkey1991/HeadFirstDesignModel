package com.core.head.model.strategy.base;

import com.core.head.model.strategy.behavior.FlyBehavior;
import com.core.head.model.strategy.behavior.QuackBehavior;

/**
 * 鸭子基类，设计成抽象类，
 */
public abstract class Duck {
    /**
     * 由于鸭子很多行为并不是所有的鸭子子类都拥有，所以我们就将不同的鸭子有不同的行为提取出来。
     * 设计原则一：找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。
     * 本个例子中就是Duck 类最好就是不需要变化，而需要变化的就是鸭子的行为类，如flyBehavior、quackBehavior
     *
     * 这两个通过接口，利用了java的多态的特性。鸭子类不需要知道行为的实现细节。
     * 鸭子的行为是组合来的，而不是继承来的，
     * 设计原则二：多用组合，少用继承。
     *
     * FlyBehavior 和 QuackBehavior 都是接口，具体的行为需要实现类来实现，这样在Duck 类中只需要声明接口类型，
     * 等在运行时JVM会将flyBehavior 和 quackBehavior 指向真正实现的类对象。
     * 设计原则三：针对接口编程，而不是针对实现编程。
     */
    protected FlyBehavior flyBehavior; // 鸭子的飞行行为，通过该对象来代理实现。
    protected QuackBehavior quackBehavior;//鸭子的叫行为，也是通过代理实现

    /**
     * 动态设定飞行行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 动态设定叫的行为
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 鸭子的外观
     */
    public abstract void display();

    public void swim() {
        System.out.println("All duck float, even decoys!");
    }

    /**
     * 鸭子的飞行行为
     */
    public void performFly() {
        //鸭子对象不亲自处理飞行的行为，而是委托给flyBehavior引用的对象
        flyBehavior.fly();
    }

    /**
     * 鸭子的叫行为
     */
    public void performQuack() {
        //鸭子对象不亲自处理呱呱叫的行为，而是委托给quackBehavior引用的对象
        quackBehavior.quack();
    }
}
