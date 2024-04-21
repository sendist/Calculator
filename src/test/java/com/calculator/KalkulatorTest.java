package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KalkulatorTest {
    
    @Test
    public void testKalkulasiAddition() {
        Kalkulator kalkulator = new Kalkulator();

        double tc1 = kalkulator.kalkulasi("4", "2", "+");
        System.out.println("Method: kalkulasi() TC1, Input: operand1= 4, operand2= 2, operator= +, Output: " + tc1);
        assertEquals(6.0, tc1, 0.0001);

        double tc2 = kalkulator.kalkulasi("-4", "-2", "+");
        System.out.println("Method: kalkulasi() TC2, Input: operand1= -4, operand2= -2, operator= +, Output: " + tc2);
        assertEquals(-6.0, tc2, 0.0001);

        double tc3 = kalkulator.kalkulasi("4", "-2", "+");
        System.out.println("Method: kalkulasi() TC3, Input: operand1= 4, operand2= -2, operator= +, Output: " + tc3);
        assertEquals(2.0, tc3, 0.0001);

        double tc4 = kalkulator.kalkulasi("32767", "-32768", "+");
        System.out.println(
                "Method: kalkulasi() TC4, Input: operand1= 32767, operand2= -32768, operator= +, Output: " + tc4);
        assertEquals(-1.0, tc4, 0.0001);
    }

    @Test
    public void testKalkulasiSubtraction() {
        Kalkulator kalkulator = new Kalkulator();

        double tc5 = kalkulator.kalkulasi("4", "2", "-");
        System.out.println("Method: kalkulasi() TC5, Input: operand1= 4, operand2= 2, operator= -, Output: " + tc5);
        assertEquals(2.0, tc5, 0.0001);

        double tc6 = kalkulator.kalkulasi("-4", "-2", "-");
        System.out.println("Method: kalkulasi() TC6, Input: operand1= -4, operand2= -2, operator= -, Output: " + tc6);
        assertEquals(-2.0, tc6, 0.0001);

        double tc7 = kalkulator.kalkulasi("4", "-2", "-");
        System.out.println("Method: kalkulasi() TC7, Input: operand1= 4, operand2= -2, operator= -, Output: " + tc7);
        assertEquals(6.0, tc7, 0.0001);

        double tc8 = kalkulator.kalkulasi("32767", "-32768", "-");
        System.out.println(
                "Method: kalkulasi() TC8, Input: operand1= 32767, operand2= -32768, operator= -, Output: " + tc8);
        assertEquals(65535.0, tc8, 0.0001);
    }

    @Test
    public void testKalkulasiMultiplication() {
        Kalkulator kalkulator = new Kalkulator();

        double tc9 = kalkulator.kalkulasi("3", "2", "*");
        System.out.println("Method: kalkulasi() TC9, Input: operand1= 3, operand2= 2, operator= *, Output: " + tc9);
        assertEquals(6.0, tc9, 0.0001);

        double tc10 = kalkulator.kalkulasi("-3", "-2", "*");
        System.out.println("Method: kalkulasi() TC10, Input: operand1= -3, operand2= -2, operator= *, Output: " + tc10);
        assertEquals(6.0, tc10, 0.0001);

        double tc11 = kalkulator.kalkulasi("3", "-2", "*");
        System.out.println("Method: kalkulasi() TC11, Input: operand1= 3, operand2= -2, operator= *, Output: " + tc11);
        assertEquals(-6.0, tc11, 0.0001);

        double tc12 = kalkulator.kalkulasi("32767", "-32768", "*");
        System.out.println(
                "Method: kalkulasi() TC12, Input: operand1= 32767, operand2= -32768, operator= *, Output: " + tc12);
        assertEquals(-1073709056.0, tc12, 0.0001);
    }

    @Test
    public void testKalkulasiDivision() {
        Kalkulator kalkulator = new Kalkulator();

        double tc13 = kalkulator.kalkulasi("6", "3", "/");
        System.out.println("Method: kalkulasi() TC13, Input: operand1= 6, operand2= 3, operator= /, Output: " + tc13);
        assertEquals(2.0, tc13, 0.0001);

        double tc14 = kalkulator.kalkulasi("-6", "-3", "/");
        System.out.println("Method: kalkulasi() TC14, Input: operand1= -6, operand2= -3, operator= /, Output: " + tc14);
        assertEquals(2.0, tc14, 0.0001);

        double tc15 = kalkulator.kalkulasi("6", "-3", "/");
        System.out.println("Method: kalkulasi() TC15, Input: operand1= 6, operand2= -3, operator= /, Output: " + tc15);
        assertEquals(-2.0, tc15, 0.0001);

        double tc16 = kalkulator.kalkulasi("32767", "-32768", "/");
        System.out.println(
                "Method: kalkulasi() TC16, Input: operand1= 32767, operand2= -32768, operator= /, Output: " + tc16);
        assertEquals(-0.999969482421875, tc16, 0.0001);
    }

    @Test
    public void testKalkulasiInvalidOperations() {
        Kalkulator kalkulator = new Kalkulator();
        double result;

        // TC17: Pengujian operasi pertambahan dengan operand kedua bukan angka
        result = kalkulator.kalkulasi("2", "dua", "+");
        System.out.println(
                "Method: kalkulasi() TC17, Input: operand1= 2, operand2= 'dua', operator= +, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC18: Pengujian operasi pengurangan dengan operand kedua bukan angka
        result = kalkulator.kalkulasi("2", "dua", "-");
        System.out.println(
                "Method: kalkulasi() TC18, Input: operand1= 2, operand2= 'dua', operator= -, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC19: Pengujian operasi perkalian dengan operand kedua bukan angka
        result = kalkulator.kalkulasi("2", "dua", "*");
        System.out.println(
                "Method: kalkulasi() TC19, Input: operand1= 2, operand2= 'dua', operator= *, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC20: Pengujian operasi pembagian dengan operand kedua bukan angka
        result = kalkulator.kalkulasi("2", "dua", "/");
        System.out.println(
                "Method: kalkulasi() TC20, Input: operand1= 2, operand2= 'dua', operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC21: Pengujian operasi pertambahan dengan nilai operand melebihi batas atas
        result = kalkulator.kalkulasi("2", "100000", "+");
        System.out.println(
                "Method: kalkulasi() TC21, Input: operand1= 2, operand2= 100000, operator= +, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC22: Pengujian operasi pertambahan dengan nilai operand melebihi batas bawah
        result = kalkulator.kalkulasi("2", "-100000", "+");
        System.out.println(
                "Method: kalkulasi() TC22, Input: operand1= 2, operand2= -100000, operator= +, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC23: Pengujian operasi pengurangan dengan nilai operand melebihi batas atas
        result = kalkulator.kalkulasi("2", "100000", "-");
        System.out.println(
                "Method: kalkulasi() TC23, Input: operand1= 2, operand2= 100000, operator= -, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC24: Pengujian operasi pengurangan dengan nilai operand melebihi batas bawah
        result = kalkulator.kalkulasi("2", "-100000", "-");
        System.out.println(
                "Method: kalkulasi() TC24, Input: operand1= 2, operand2= -100000, operator= -, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC25: Pengujian operasi perkalian dengan nilai operand melebihi batas atas
        result = kalkulator.kalkulasi("2", "100000", "*");
        System.out.println(
                "Method: kalkulasi() TC25, Input: operand1= 2, operand2= 100000, operator= *, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC26: Pengujian operasi perkalian dengan nilai operand melebihi batas bawah
        result = kalkulator.kalkulasi("2", "-100000", "*");
        System.out.println(
                "Method: kalkulasi() TC26, Input: operand1= 2, operand2= -100000, operator= *, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC27: Pengujian operasi pembagian dengan nilai operand melebihi batas atas
        result = kalkulator.kalkulasi("100000", "2", "/");
        System.out.println(
                "Method: kalkulasi() TC27, Input: operand1= 100000, operand2= 2, operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC28: Pengujian operasi pembagian dengan nilai operand melebihi batas bawah
        result = kalkulator.kalkulasi("-100000", "2", "/");
        System.out.println(
                "Method: kalkulasi() TC28, Input: operand1= -100000, operand2= 2, operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC29: Pengujian operasi yang tidak dikenali, contoh operasi pangkat
        result = kalkulator.kalkulasi("2", "4", "^");
        System.out.println("Method: kalkulasi() TC29, Input: operand1= 2, operand2= 4, operator= ^, Output: " + result);
        assertTrue(Double.isNaN(result));

        // TC30: Pengujian operasi pembagian dengan pembagi bernilai nol
        result = kalkulator.kalkulasi("2", "0", "/");
        System.out.println("Method: kalkulasi() TC30, Input: operand1= 2, operand2= 0, operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testIsValid() {
        // TC01: Pengujian operand1 dan operand2 merupakan angka dalam range, operator valid, dan pembagi tidak nol
        boolean hasil = Kalkulator.isValid("3", "5", "+");
        System.out.println("Method: isValid() TC01, Input: operand1 = 3, operand2 = 5, operator = +, Output: " + hasil);
        assertTrue(hasil);

        // TC02: Pengujian dengan operand yang bukan merupakan angka
        hasil = Kalkulator.isValid("hai", "{}", "/");
        System.out.println("Method: isValid() TC02, Input: operand1 = 'hai', operand2 = '{}', operator = /, Output: " + hasil);
        assertFalse(hasil);

        // TC03: Pengujian dengan operand angka yang berada di luar range
        hasil = Kalkulator.isValid("35000", "30", "-");
        System.out.println("Method: isValid() TC03, Input: operand1 = 35000, operand2 = 30, operator = -, Output: " + hasil);
        assertFalse(hasil);

        // TC04: Pengujian dengan operator yang tidak valid
        hasil = Kalkulator.isValid("12", "1", "B");
        System.out.println("Method: isValid() TC04, Input: operand1 = 12, operand2 = 1, operator = B, Output: " + hasil);
        assertFalse(hasil);

        // TC05: Pengujian pembagian dengan pembagi nol
        hasil = Kalkulator.isValid("7", "0", "/");
        System.out.println("Method: isValid() TC05, Input: operand1 = 7, operand2 = 0, operator = /, Output: " + hasil);
        assertFalse(hasil);
    }

}
