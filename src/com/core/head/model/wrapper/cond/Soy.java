package com.core.head.model.wrapper.cond;

import com.core.head.model.wrapper.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public CoffeeMlType getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == CoffeeMlType.tall) {
            cost += .10;
        } else if (getSize() == CoffeeMlType.grande) {
            cost += .15;
        } else if (getSize() == CoffeeMlType.venti) {
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
