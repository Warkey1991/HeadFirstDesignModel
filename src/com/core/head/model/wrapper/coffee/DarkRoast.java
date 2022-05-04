package com.core.head.model.wrapper.coffee;

import com.core.head.model.wrapper.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = " DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
