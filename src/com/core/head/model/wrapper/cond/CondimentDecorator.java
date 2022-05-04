package com.core.head.model.wrapper.cond;

import com.core.head.model.wrapper.Beverage;

/**
 * 调料抽象类，必须能够取代Beverage , 所以要继承Beverage。
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 所有的调料装饰者都必须重新实现getDescription 方法。
     * @return
     */
    public abstract String getDescription();
}
