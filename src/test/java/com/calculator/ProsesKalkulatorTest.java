package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProsesKalkulatorTest {
    ProsesKalkulator prosesKalkulator = new ProsesKalkulator();

    @Test
    public void testTambah() {
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double tc1 = prosesKalkulator.tambah(4, 10);
        System.out.println("Method: tambah() TC1, Input: operand1=" + 4 + ", operand2=" + 10 + ", Output: " + tc1);
        assertEquals(14.0, tc1, 0.0001);

        double tc2 = prosesKalkulator.tambah(-3, -1);
        System.out.println("Method: tambah() TC2, Input: operand1=" + -3 + ", operand2=" + -1 + ", Output: " + tc2);
        assertEquals(-4.0, tc2, 0.0001);

        double tc3 = prosesKalkulator.tambah(-1, 10);
        System.out.println("Method: tambah() TC3, Input: operand1=" + -1 + ", operand2=" + 10 + ", Output: " + tc3);
        assertEquals(9.0, tc3, 0.0001);

        double tc4 = prosesKalkulator.tambah(32767, -32768);
        System.out.println(
                "Method: tambah() TC4, Input: operand1=" + 32767 + ", operand2=" + -32768 + ", Output: " + tc4);
        assertEquals(-1.0, tc4, 0.0001);

        double tc5 = prosesKalkulator.tambah(32767, 10);
        System.out.println("Method: tambah() TC5, Input: operand1=" + 32767 + ", operand2=" + 10 + ", Output: " + tc5);
        assertEquals(32777.0, tc5, 0.0001);

        double tc6 = prosesKalkulator.tambah(-1, -32768);
        System.out.println("Method: tambah() TC5, Input: operand1=" + -1 + ", operand2=" + -32768 + ", Output: " + tc6);
        assertEquals(-32769.0, tc6, 0.0001);
    }

    @Test
    public void testKurang() {
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double tc1 = prosesKalkulator.kurang(10, 4);
        System.out.println("Method: kurang() TC1, Input: operand1=" + 10 + ", operand2=" + 4 + ", Output: " + tc1);
        assertEquals(6.0, tc1, 0.0001);

        double tc2 = prosesKalkulator.kurang(-3, -1);
        System.out.println("Method: kurang() TC2, Input: operand1=" + -3 + ", operand2=" + -1 + ", Output: " + tc2);
        assertEquals(-2.0, tc2, 0.0001);

        double tc3 = prosesKalkulator.kurang(-1, 10);
        System.out.println("Method: kurang() TC3, Input: operand1=" + -1 + ", operand2=" + 10 + ", Output: " + tc3);
        assertEquals(-11.0, tc3, 0.0001);

        double tc4 = prosesKalkulator.kurang(32767, -32768);
        System.out.println(
                "Method: kurang() TC4, Input: operand1=" + 32767 + ", operand2=" + -32768 + ", Output: " + tc4);
        assertEquals(65535.0, tc4, 0.0001);

        double tc5 = prosesKalkulator.kurang(32767, -10);
        System.out.println("Method: kurang() TC5, Input: operand1=" + 32767 + ", operand2=" + -10 + ", Output: " + tc5);
        assertEquals(32777.0, tc5, 0.0001);

        double tc6 = prosesKalkulator.kurang(-1, 32768);
        System.out.println("Method: kurang() TC6, Input: operand1=" + -1 + ", operand2=" + 32768 + ", Output: " + tc6);
        assertEquals(-32769.0, tc6, 0.0001);
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

        hasil = prosesKalkulator.kali(32767, 10);
        System.out.println(
                "Method: kali() TC04, Input: operand1 = " + 32767 + ", operand2 =" + 10 + ", Output: " + hasil);
        assertEquals(327670.0, hasil, 0.0001);

        hasil = prosesKalkulator.kali(1, -32768);
        System.out.println(
                "Method: kali() TC05, Input: operand1 = " + 1 + ", operand2 =" + -32768 + ", Output: " + hasil);
        assertEquals(-32768.0, hasil, 0.0001);
    }

    @Test
    public void testBagiTc1() {
        double result = prosesKalkulator.bagi(4, 2);
        System.out.println("Method: bagi() TC1, Input: operand1=4, operand2=2, Output: " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testBagiTc2() {
        double result = prosesKalkulator.bagi(-8, -2);
        System.out.println("Method: bagi() TC2, Input: operand1=-8, operand2=-2, Output: " + result);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testBagiTc3() {
        double result = prosesKalkulator.bagi(4, -2);
        System.out.println("Method: bagi() TC3, Input: operand1=4, operand2=-2, Output: " + result);
        assertEquals(-2.0, result, 0.0001);
    }

    @Test
    public void testBagiTc4() {
        double result = prosesKalkulator.bagi(32767, -32768);
        System.out.println("Method: bagi() TC4, Input: operand1=32767, operand2=-32768, Output: " + result);
        assertEquals(-0.99996, result, 0.0001);
    }

    @Test
    public void testBagiTc5() {
        double result = prosesKalkulator.bagi(32767, 15);
        System.out.println("Method: bagi() TC5, Input: operand1=32767, operand2=15, Output: " + result);
        assertEquals(2184.4666666666667, result, 0.0001);
    }

    @Test
    public void testBagiTc6() {
        double result = prosesKalkulator.bagi(32767, -15);
        System.out.println("Method: bagi() TC6, Input: operand1=32767, operand2=-15, Output: " + result);
        assertEquals(-2184.4666666666667, result, 0.0001);
    }

    @Test
    public void testBagiTc7() {
        double result = prosesKalkulator.bagi(-32768, 32767);
        System.out.println("Method: bagi() TC7, Input: operand1=-32768, operand2=32767, Output: " + result);
        assertEquals(-1.00003, result, 0.0001);
    }

    @Test
    public void testBagiTc8() {
        double result = prosesKalkulator.bagi(-32768, 2);
        System.out.println("Method: bagi() TC8, Input: operand1=-32768, operand2=2, Output: " + result);
        assertEquals(-16384.0, result, 0.0001);
    }

    @Test
    public void testBagiTc9() {
        double result = prosesKalkulator.bagi(-32768, -2);
        System.out.println("Method: bagi() TC9, Input: operand1=-32768, operand2=-2, Output: " + result);
        assertEquals(16384.0, result, 0.0001);
    }

    @Test
    public void testBagiTc10() {
        double result = prosesKalkulator.bagi(0, 4);
        System.out.println("Method: bagi() TC10, Input: operand1=0, operand2=4, Output: " + result);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testBagiTc11() {
        double result = prosesKalkulator.bagi(0, -2);
        System.out.println("Method: bagi() TC11, Input: operand1=0, operand2=-2, Output: " + result);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testBagiTc12() {
        double result = prosesKalkulator.bagi(4, 0);
        System.out.println("Method: bagi() TC12, Input: operand1=4, operand2=0, Output: " + result);
        assertTrue(Double.isInfinite(result));
    }
}
