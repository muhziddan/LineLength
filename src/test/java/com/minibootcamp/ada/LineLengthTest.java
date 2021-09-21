package com.minibootcamp.ada;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLengthTest {

    @Test
    @DisplayName("Should return zero when calculating the length of zero length line")
    public void calculateZeroLengthLineTest() {
        LineLength lineLength = new LineLength();

        assertEquals(0, lineLength.calculateZeroLengthLine());
    }

    @Test
    @DisplayName("Should return 5 when calculating the Horizontal origin line length")
    public void calculateHorizontalOriginTest() {
        LineLength lineLength = new LineLength();

        assertEquals(5, lineLength.calculateHorizontalOrigin(0, 5));
    }

    @Test
    @DisplayName("Should return 7 when calculating the Vertical origin line length")
    public void calculateVerticalOriginTest() {
        LineLength lineLength = new LineLength();

        assertEquals(7, lineLength.calculateVerticalOrigin(0, 7));
    }
}
