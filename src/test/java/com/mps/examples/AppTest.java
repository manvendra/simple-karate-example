package com.mps.examples;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testParallel() {
        com.intuit.karate.Results results =
                com.intuit.karate.Runner
                        .builder()
                        .relativeTo(getClass())
                        .parallel(5);

        org.junit.jupiter.api.Assertions.assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}