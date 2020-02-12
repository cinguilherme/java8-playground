package com.gcc.playground;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestSimpleStrategy {

    SimpleStrategy subject;

    @BeforeEach
    void setup() {
        subject = new SimpleStrategy();
    }

    @Test
    void shouldReturn2() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        Optional<Long> actual = subject.process(map).get();
        Optional<Long> expected = Optional.of(2L);
        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldReturnNMothing() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("two", "2");
        Optional<Long> actual = subject.process(map).get();
        Assert.assertFalse(actual.isPresent());
    }

}
