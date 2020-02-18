package com.gcc.playground;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class HashService {

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        return map;
    }

    public static Supplier<Optional<Map<String, String>>> getMapSupply() {
        return () -> {
            Map<String, String> hash = new HashMap<>();
            hash.put("one", "1");
            return Optional.of(hash);
        };
    }


}
