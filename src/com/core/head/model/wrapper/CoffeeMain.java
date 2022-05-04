package com.core.head.model.wrapper;

import com.core.head.model.wrapper.coffee.DarkRoast;
import com.core.head.model.wrapper.coffee.Espresso;
import com.core.head.model.wrapper.coffee.HouseBlend;
import com.core.head.model.wrapper.cond.Mocha;
import com.core.head.model.wrapper.cond.Soy;
import com.core.head.model.wrapper.cond.Whip;

public class CoffeeMain {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        //原始浓缩咖啡的价格
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.CoffeeMlType.venti);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
