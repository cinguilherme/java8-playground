package com.gcc.playground;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class StrategyFactoryTest {

    @Test
    void shouldGetStrategyEmpty() {
        String strategyName = "none";
        Optional<Strategy> strategy = StrategyFactory.getStrategy(strategyName);
        Assert.assertFalse(strategy.isPresent());
    }

    @Test
    void shouldGetStrategySimple() {
        String strategyName = "simple";
        Optional<Strategy> strategy = StrategyFactory.getStrategy(strategyName);
        Assert.assertTrue(strategy.isPresent());
        Assert.assertEquals(strategy.get().getClass().getName(),
                SimpleStrategy.class.getName());
    }
}