package com.core.head.model.wrapper.coffee;

import com.core.head.model.wrapper.Beverage;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99; //现在不需要调料的价格，只需要返回Espresso 的价格。
    }
}
