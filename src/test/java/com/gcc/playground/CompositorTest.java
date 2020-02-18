package com.gcc.playground;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompositorTest {

    Compositor subject;

    @BeforeEach
    void setup() {
        subject = new Compositor();
    }

    @Test
    void calculateFinalCost() {
        Double actual = subject.calculateFinalCost(10, 0D);
        Double expected = 19.98;
        Assert.assertEquals(expected, actual);

    }
}