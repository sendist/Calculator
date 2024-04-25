package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProsesKalkulatorTest {

    private ProsesKalkulator prosesKalkulator;

    @BeforeEach
    public void setUp() {
        prosesKalkulator = new ProsesKalkulator();
    }

    @Test
    public void testTambahTC01() {
        double result = prosesKalkulator.tambah(4, 10);
        System.out.println("Method: tambah() TC1, Input: operand1=" + 4 + ", operand2=" + 10 + ", Output: " + result);
        assertEquals(14.0, result, 0.0001);
    }

    @Test
    public void testTambahTC02() {
        double result = prosesKalkulator.tambah(-3, -1);
        System.out.println("Method: tambah() TC2, Input: operand1=" + -3 + ", operand2=" + -1 + ", Output: " + result);
        assertEquals(-4.0, result, 0.0001);
    }

    @Test
    public void testTambahTC03() {
        double result = prosesKalkulator.tambah(-1, 10);
        System.out.println("Method: tambah() TC3, Input: operand1=" + -1 + ", operand2=" + 10 + ", Output: " + result);
        assertEquals(9.0, result, 0.0001);
    }

    @Test
    public void testTambahTC04() {
        double result = prosesKalkulator.tambah(32767, -32768);
        System.out.println(
                "Method: tambah() TC4, Input: operand1=" + 32767 + ", operand2=" + -32768 + ", Output: " + result);
        assertEquals(-1.0, result, 0.0001);
    }

    @Test
    public void testTambahTC05() {
        double result = prosesKalkulator.tambah(32767, 10);
        System.out
                .println("Method: tambah() TC5, Input: operand1=" + 32767 + ", operand2=" + 10 + ", Output: " + result);
        assertEquals(32777.0, result, 0.0001);
    }

    @Test
    public void testTambahTC06() {
        double result = prosesKalkulator.tambah(-1, -32768);
        System.out.println(
                "Method: tambah() TC6, Input: operand1=" + -1 + ", operand2=" + -32768 + ", Output: " + result);
        assertEquals(-32769.0, result, 0.0001);
    }

    @Test
    public void testKurangTC01() {
        double result = prosesKalkulator.kurang(10, 4);
        System.out.println("Method: kurang() TC1, Input: operand1=" + 10 + ", operand2=" + 4 + ", Output: " + result);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testKurangTC02() {
        double result = prosesKalkulator.kurang(-3, -1);
        System.out.println("Method: kurang() TC2, Input: operand1=" + -3 + ", operand2=" + -1 + ", Output: " + result);
        assertEquals(-2.0, result, 0.0001);
    }

    @Test
    public void testKurangTC03() {
        double result = prosesKalkulator.kurang(-1, 10);
        System.out.println("Method: kurang() TC3, Input: operand1=" + -1 + ", operand2=" + 10 + ", Output: " + result);
        assertEquals(-11.0, result, 0.0001);
    }

    @Test
    public void testKurangTC04() {
        double result = prosesKalkulator.kurang(32767, -32768);
        System.out.println(
                "Method: kurang() TC4, Input: operand1=" + 32767 + ", operand2=" + -32768 + ", Output: " + result);
        assertEquals(65535.0, result, 0.0001);
    }

    @Test
    public void testKurangTC05() {
        double result = prosesKalkulator.kurang(32767, -10);
        System.out.println(
                "Method: kurang() TC5, Input: operand1=" + 32767 + ", operand2=" + -10 + ", Output: " + result);
        assertEquals(32777.0, result, 0.0001);
    }

    @Test
    public void testKurangTC06() {
        double result = prosesKalkulator.kurang(-1, 32768);
        System.out
                .println("Method: kurang() TC6, Input: operand1=" + -1 + ", operand2=" + 32768 + ", Output: " + result);
        assertEquals(-32769.0, result, 0.0001);
    }

    @Test
    public void testKali() {
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double hasil = prosesKalkulator.kali(4, 10);
        System.out.println("Method: kali() TC01, Input: operand1 = " + 4 + ", operand2 =" + 10 + ", Output: " + hasil);
        assertEquals(40.0, hasil, 0.0001);

        hasil = prosesKalkulator.kali(-3, -1);
        System.out.println("Method: kali() TC02, Input: operand1 = " + -3 + ", operand2 =" + -1 + ", Output: " + hasil);
        assertEquals(3.0, hasil, 0.0001);

        hasil = prosesKalkulator.kali(-1, 10);
        System.out.println("Method: kali() TC03, Input: operand1 = " + -1 + ", operand2 =" + 10 + ", Output: " + hasil);
        assertEquals(-10.0, hasil, 0.0001);

        hasil = prosesKalkulator.kali(32767,10);
        System.out.println("Method: kali() TC04, Input: operand1 = " + 32767 + ", operand2 =" + 10 + ", Output: " + hasil);
        assertEquals(327670.0, hasil, 0.0001);

        hasil = prosesKalkulator.kali(1,-32768);
        System.out.println("Method: kali() TC05, Input: operand1 = " + 1 + ", operand2 =" + -32768 + ", Output: " + hasil);
        assertEquals(-32768.0, hasil, 0.0001);
    }

    @Test
    public void testBagi() {
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double tc1 = prosesKalkulator.bagi(4, 2);
        System.out.println("Method: bagi() TC1, Input: operand1=" + 4 + ", operand2=" + 2 + ", Output: " + tc1);
        assertEquals(2.0, tc1, 0.0001);

        double tc2 = prosesKalkulator.bagi(-8, -2);
        System.out.println("Method: bagi() TC1, Input: operand1=" + -8 + ", operand2=" + -2 + ", Output: " + tc2);
        assertEquals(4.0, tc2, 0.0001);

        double tc3 = prosesKalkulator.bagi(4, -2);
        System.out.println("Method: bagi() TC1, Input: operand1=" + 4 + ", operand2=" + -2 + ", Output: " + tc3);
        assertEquals(-2.0, tc3, 0.0001);

        double tc4 = prosesKalkulator.bagi(32767, -32768);
        System.out
                .println("Method: bagi() TC1, Input: operand1=" + 32767 + ", operand2=" + -32768 + ", Output: " + tc4);
        assertEquals(-0.99996, tc4, 0.0001);

        double tc5 = prosesKalkulator.bagi(32767, 15);
        System.out.println("Method: bagi() TC1, Input: operand1=" + 32767 + ", operand2=" + 15 + ", Output: " + tc5);
        assertEquals(2184.4666666666667, tc5, 0.0001);

        double tc6 = prosesKalkulator.bagi(32767, -15);
        System.out.println("Method: bagi() TC1, Input: operand1=" + 32767 + ", operand2=" + -15 + ", Output: " + tc6);
        assertEquals(-2184.4666666666667, tc6, 0.0001);

        double tc7 = prosesKalkulator.bagi(-32768, 32767);
        System.out
                .println("Method: bagi() TC1, Input: operand1=" + -32768 + ", operand2=" + 32767 + ", Output: " + tc7);
        assertEquals(-1.00003, tc7, 0.0001);

        double tc8 = prosesKalkulator.bagi(-32768, 2);
        System.out.println("Method: bagi() TC1, Input: operand1=" + -32768 + ", operand2=" + 2 + ", Output: " + tc8);
        assertEquals(-16384.0, tc8, 0.0001);

        double tc9 = prosesKalkulator.bagi(-32768, -2);
        System.out.println("Method: bagi() TC1, Input: operand1=" + -32768 + ", operand2=" + -2 + ", Output: " + tc9);
        assertEquals(16384.0, tc9, 0.0001);

        double tc10 = prosesKalkulator.bagi(0, 4);
        System.out.println("Method: bagi() TC1, Input: operand1=" + 0 + ", operand2=" + 4 + ", Output: " + tc10);
        assertEquals(0.0, tc10, 0.0001);

        double tc11 = prosesKalkulator.bagi(0, -2);
        System.out.println("Method: bagi() TC1, Input: operand1=" + 0 + ", operand2=" + -2 + ", Output: " + tc11);
        assertEquals(0.0, tc11, 0.0001);

        double tc12 = prosesKalkulator.bagi(4, 0);
        System.out.println("Method: bagi() TC12, Input: operand1=" + 4 + ", operand2=" + 0 + ", Output: " + tc12);
        assertTrue(Double.isInfinite(tc12), "Expected result should be infinity for division by zero");
    }
}
