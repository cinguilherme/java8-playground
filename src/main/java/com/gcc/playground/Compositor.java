package com.gcc.playground;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Compositor {

    private Function<Integer, Integer> addTax = i -> i + 10;
    private Function<Integer, Integer> deductPostMan = i -> i - 2;
    private Function<Integer, Double> applyGovTax = val -> val * 1.11;
    private BiFunction<Double, Double, Double> applyDiscountIfAany = (val, discount) -> val - discount;

    public Double calculateFinalCost(Integer val, Double discount) {
        Function<Double, Double> tConsumer = (y) -> applyDiscountIfAany.apply(y, discount);
        return addTax.andThen(deductPostMan)
                .andThen(applyGovTax)
                .andThen(tConsumer)
                .apply(val);


    }


}
