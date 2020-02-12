package com.gcc.playground;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class SimpleStrategy implements Strategy {

    @Override
    public Supplier<Optional<Long>> process(Map<String, String> map) {
        return () -> {
            try {
                return Optional.of((long) (1 + Integer.parseInt(map.get("one"))));
            } catch (RuntimeException rte) {
                return Optional.empty();
            }
        };
    }
}
