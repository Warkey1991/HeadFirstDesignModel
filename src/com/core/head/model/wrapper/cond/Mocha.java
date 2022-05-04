package com.core.head.model.wrapper.cond;

import com.core.head.model.wrapper.Beverage;

/**
 * 摩卡咖啡
 * 是一个装饰类，所以需要继承CondimentDecorator，
 */
public class Mocha extends CondimentDecorator {
    /**
     * 　记录饮料，也就是被装饰者。
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 要计算带Mocha 饮料的价格，首先把调用委托给被装饰者对象，以计算价格，然后加上Mocha 的价格，
     * 得到最终价格。
     */
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
