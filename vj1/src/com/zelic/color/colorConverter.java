package com.zelic.color;

//import java.awt.Color;

public class colorConverter {
        public static void main(String[] args) {

            String hexColor = "0xAEEEEE";

            colorCustom c = colorCustom.decode(hexColor);

            float[] hsbCode = new float[3];

            colorCustom.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), hsbCode);

            float[] hslCode = new float[3];

            colorCustom.RGBtoHSL(c.getRed(), c.getGreen(), c.getBlue(), hslCode);

            float[] cmykCode = new float[4];

            colorCustom.RGBtoCMYK(c.getRed(), c.getGreen(), c.getBlue(), cmykCode);


            System.out.println("Boja u HEX formatu: 0x" + Integer.toHexString(c.getRGB() & 0x00FFFFFF));

            System.out.println("Boja u RGB formatu: " + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue());

            System.out.println(
                    "Boja u HSB formatu: " + hsbCode[0] * 360 + "°, " + hsbCode[1] * 100 + "%, " + hsbCode[2] * 100 + "%");

            System.out.println(
                    "Boja u HSL formatu: " + hslCode[0] * 60 + "°, " + hslCode[1] * 100 + "%, " + hslCode[2] * 100 + "%");

            System.out.println(
                    "Boja u CMYK formatu: " + cmykCode[0] * 100 + "%, " + cmykCode[1] * 100 + "%, " + cmykCode[2] * 100 + "%, " + cmykCode[3] * 100 + "%");

        }
}

