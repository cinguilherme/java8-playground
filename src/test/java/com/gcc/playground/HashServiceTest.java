package com.gcc.playground;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

class HashServiceTest {

    @Test
    void getMap() {

    }

    @Test
    void getMapSupply() {

    }

    @Test
    void unwrapper() {
        Supplier<Optional<Map<String, String>>> mapSupply = HashService.getMapSupply();
        Map<String, String> actual = HashService.unwrapper(mapSupply);
        Map<String, String> expected = new HashMap<>();
        expected.put("one", "1");
        Assert.assertEquals(actual, expected);
    }
}