package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProsesKalkulatorTest {

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
        System.out.println("Method: tambah() TC4, Input: operand1=" + 32767 + ", operand2=" + -32768 + ", Output: " + tc4);
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
        double a = 2.0;
        double b = 3.0;
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double hasil = prosesKalkulator.kali(a, b);
        System.out.println("Method: testKali, Input: a=" + a + ", b=" + b + ", Output: " + hasil);
        assertEquals(6.0, hasil, 0.0001); // Menguji apakah 2 * 3 = 6
    }

    @Test
    public void testBagi() {
        double a = 6.0;
        double b = 3.0;
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double hasil = prosesKalkulator.bagi(a, b);
        System.out.println("Method: testBagi, Input: a=" + a + ", b=" + b + ", Output: " + hasil);
        assertEquals(2.0, hasil, 0.0001); // Menguji apakah 6 / 3 = 2
    }
}
