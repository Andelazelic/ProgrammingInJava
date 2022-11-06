package com.zelic.color.test;

import com.zelic.color.colorCustom;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class ColorTest {
    @Test
    public void decodeTest() {
        String givenHex = "0xAEEEEE";
        int expectedRed = 174;
        int expectedGreen = 238;
        int expectedBlue = 238;

        colorCustom result = colorCustom.decode(givenHex);

        assertEquals(expectedRed, result.getRed());
        assertEquals(expectedGreen, result.getGreen());
        assertEquals(expectedBlue, result.getBlue());
        assertNotEquals(expectedRed, result.getBlue());
    }

    @Test
    public void RGBtoHSBTest() {
        int givenRed = 174;
        int givenGreen = 238;
        int givenBlue = 238;
        float[] givenHSB = new float[3];
        float[] expectedHSB = { (float) 0.5, (float) 0.26890759, (float) 0.93333336 };

        float[] result = colorCustom.RGBtoHSB(givenRed, givenGreen, givenBlue, givenHSB);

        assertEquals(expectedHSB[0], result[0], 1e-7);
        assertEquals(expectedHSB[1], result[1], 1e-7);
        assertEquals(expectedHSB[2], result[2], 1e-7);
    }

    @Test
    public void RGBtoHSLTest() {
        int givenRed = 174;
        int givenGreen = 238;
        int givenBlue = 238;
        float[] givenHSL = new float[3];
        float[] expectedHSL = { (float) 3.0, (float) 0.6530612, (float) 0.8078432 };

        float[] result = colorCustom.RGBtoHSL(givenRed, givenGreen, givenBlue, givenHSL);

        assertEquals(expectedHSL[0], result[0], 1e-7);
        assertEquals(expectedHSL[1], result[1], 1e-7);
        assertEquals(expectedHSL[2], result[2], 1e-7);
    }

    @Test
    public void RGBtoCMYKTest() {
        int givenRed = 174;
        int givenGreen = 238;
        int givenBlue = 238;
        float[] givenCMYK = new float[4];
        float[] expectedCMYK = { (float) 0.26890755, (float) 0.0, (float) 0.0, (float) 0.6666666 };

        float[] result = colorCustom.RGBtoCMYK(givenRed, givenGreen, givenBlue, givenCMYK);

        assertEquals(expectedCMYK[0], result[0], 1e-7);
        assertEquals(expectedCMYK[1], result[1], 1e-7);
        assertEquals(expectedCMYK[2], result[2], 1e-7);
    }

}
