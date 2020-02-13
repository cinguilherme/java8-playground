package com.gcc.playground;

import java.util.Optional;

public class StrategyFactory {

    public static Optional<Strategy> getStrategy(String message) {

        if (message.equals("simple")) {
            return Optional.of(new SimpleStrategy());
        }
        return Optional.empty();
    }

}
