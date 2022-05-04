package com.core.head.model.wrapper;

/**
 * 星巴兹咖啡的超类，保证装饰者和被装饰者类型一致。
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";
    private CoffeeMlType coffeeMlType;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(CoffeeMlType coffeeMlType) {
        this.coffeeMlType = coffeeMlType;
    }

    public CoffeeMlType getSize() {
        return coffeeMlType;
    }

    public enum CoffeeMlType {
        tall("小杯"), grande("中杯"), venti(" 大杯");

        CoffeeMlType(String value) {
        }
    }
}
