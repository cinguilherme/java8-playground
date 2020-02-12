package com.gcc.playground;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public interface Strategy {

    Supplier<Optional<Long>> process(Map<String, String> map);

}
