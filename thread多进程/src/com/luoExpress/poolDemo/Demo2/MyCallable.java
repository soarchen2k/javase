package com.luoExpress.PoolDemo.Demo2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    private double aDouble;
    private double bDouble;

    public MyCallable(double aDouble, double bDouble) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
    }

    @Override
    public Object call() throws Exception {
        return aDouble + bDouble;
    }
}
