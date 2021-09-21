package com.minibootcamp.ada;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLengthTest {

    @Test
    @DisplayName("Should return zero when calculating the length of zero length line")
    public void calculateZeroLengthLineTest() {
        LineLength line = new LineLength();

        assertEquals(0, line.calculateLength());
    }
}
