package com.core.head.model.wrapper.coffee;

import com.core.head.model.wrapper.Beverage;

public class Deck extends Beverage {
    public Deck() {
        description = "Deck Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
