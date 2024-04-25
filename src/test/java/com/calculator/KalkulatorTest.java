package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KalkulatorTest {
    Kalkulator kalkulator = new Kalkulator();    
    
    @Test
    public void testKalkulasiTc1() {
        double result = kalkulator.kalkulasi("4", "2", "+");
        System.out.println("Method: kalkulasi() TC1, Input: operand1=4, operand2=2, operator=+, Output: " + result);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc2() {
        double result = kalkulator.kalkulasi("-4", "-2", "+");
        System.out.println("Method: kalkulasi() TC2, Input: operand1=-4, operand2=-2, operator=+, Output: " + result);
        assertEquals(-6.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc3() {
        double result = kalkulator.kalkulasi("4", "-2", "+");
        System.out.println("Method: kalkulasi() TC3, Input: operand1=4, operand2=-2, operator=+, Output: " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc4() {
        double result = kalkulator.kalkulasi("32767", "-32768", "+");
        System.out.println("Method: kalkulasi() TC4, Input: operand1=32767, operand2=-32768, operator=+, Output: " + result);
        assertEquals(-1.0, result, 0.0001);
    }
    
    @Test
    public void testKalkulasiTc5() {
        double result = kalkulator.kalkulasi("4", "2", "-");
        System.out.println("Method: kalkulasi() TC5, Input: operand1=4, operand2=2, operator=-, Output: " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc6() {
        double result = kalkulator.kalkulasi("-4", "-2", "-");
        System.out.println("Method: kalkulasi() TC6, Input: operand1=-4, operand2=-2, operator=-, Output: " + result);
        assertEquals(-2.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc7() {
        double result = kalkulator.kalkulasi("4", "-2", "-");
        System.out.println("Method: kalkulasi() TC7, Input: operand1=4, operand2=-2, operator=-, Output: " + result);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc8() {
        double result = kalkulator.kalkulasi("32767", "-32768", "-");
        System.out.println("Method: kalkulasi() TC8, Input: operand1=32767, operand2=-32768, operator=-, Output: " + result);
        assertEquals(65535.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc9() {
        double result = kalkulator.kalkulasi("3", "2", "*");
        System.out.println("Method: kalkulasi() TC9, Input: operand1=3, operand2=2, operator=*, Output: " + result);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc10() {
        double result = kalkulator.kalkulasi("-3", "-2", "*");
        System.out.println("Method: kalkulasi() TC10, Input: operand1=-3, operand2=-2, operator=*, Output: " + result);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc11() {
        double result = kalkulator.kalkulasi("3", "-2", "*");
        System.out.println("Method: kalkulasi() TC11, Input: operand1=3, operand2=-2, operator=*, Output: " + result);
        assertEquals(-6.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc12() {
        double result = kalkulator.kalkulasi("32767", "-32768", "*");
        System.out.println("Method: kalkulasi() TC12, Input: operand1=32767, operand2=-32768, operator=*, Output: " + result);
        assertEquals(-1073709056.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc13() {
        double result = kalkulator.kalkulasi("6", "3", "/");
        System.out.println("Method: kalkulasi() TC13, Input: operand1=6, operand2=3, operator=/, Output: " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc14() {
        double result = kalkulator.kalkulasi("-6", "-3", "/");
        System.out.println("Method: kalkulasi() TC14, Input: operand1=-6, operand2=-3, operator=/, Output: " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc15() {
        double result = kalkulator.kalkulasi("6", "-3", "/");
        System.out.println("Method: kalkulasi() TC15, Input: operand1=6, operand2=-3, operator=/, Output: " + result);
        assertEquals(-2.0, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc16() {
        double result = kalkulator.kalkulasi("32767", "-32768", "/");
        System.out.println("Method: kalkulasi() TC16, Input: operand1=32767, operand2=-32768, operator=/, Output: " + result);
        assertEquals(-0.999969482421875, result, 0.0001);
    }

    @Test
    public void testKalkulasiTc17() {
        double result = kalkulator.kalkulasi("2", "dua", "+");
        System.out.println("Method: kalkulasi() TC17, Input: operand1= 2, operand2= 'dua', operator= +, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc18() {
        double result = kalkulator.kalkulasi("2", "dua", "-");
        System.out.println("Method: kalkulasi() TC18, Input: operand1= 2, operand2= 'dua', operator= -, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc19() {
        double result = kalkulator.kalkulasi("2", "dua", "*");
        System.out.println("Method: kalkulasi() TC19, Input: operand1= 2, operand2= 'dua', operator= *, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc20() {
        double result = kalkulator.kalkulasi("2", "dua", "/");
        System.out.println("Method: kalkulasi() TC20, Input: operand1= 2, operand2= 'dua', operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc21() {
        double result = kalkulator.kalkulasi("2", "100000", "+");
        System.out.println("Method: kalkulasi() TC21, Input: operand1= 2, operand2= 100000, operator= +, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc22() {
        double result = kalkulator.kalkulasi("2", "-100000", "+");
        System.out.println("Method: kalkulasi() TC22, Input: operand1= 2, operand2= -100000, operator= +, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc23() {
        double result = kalkulator.kalkulasi("2", "100000", "-");
        System.out.println("Method: kalkulasi() TC23, Input: operand1= 2, operand2= 100000, operator= -, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc24() {
        double result = kalkulator.kalkulasi("2", "-100000", "-");
        System.out.println("Method: kalkulasi() TC24, Input: operand1= 2, operand2= -100000, operator= -, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc25() {
        double result = kalkulator.kalkulasi("2", "100000", "*");
        System.out.println("Method: kalkulasi() TC25, Input: operand1= 2, operand2= 100000, operator= *, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc26() {
        double result = kalkulator.kalkulasi("2", "-100000", "*");
        System.out.println("Method: kalkulasi() TC26, Input: operand1= 2, operand2= -100000, operator= *, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc27() {
        double result = kalkulator.kalkulasi("100000", "2", "/");
        System.out.println("Method: kalkulasi() TC27, Input: operand1= 100000, operand2= 2, operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc28() {
        double result = kalkulator.kalkulasi("-100000", "2", "/");
        System.out.println("Method: kalkulasi() TC28, Input: operand1= -100000, operand2= 2, operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc29() {
        double result = kalkulator.kalkulasi("2", "4", "^");
        System.out.println("Method: kalkulasi() TC29, Input: operand1= 2, operand2= 4, operator= ^, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testKalkulasiTc30() {
        double result = kalkulator.kalkulasi("2", "0", "/");
        System.out.println("Method: kalkulasi() TC30, Input: operand1= 2, operand2= 0, operator= /, Output: " + result);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testIsValidOperandInRange() {
        // TC01: Pengujian operand1 dan operand2 merupakan angka dalam range, operator valid, dan pembagi tidak nol
        boolean hasil = Kalkulator.isValid("3", "5", "+");
        System.out.println("Method: isValid() TC01, Input: operand1 = 3, operand2 = 5, operator = +, Output: " + hasil);
        assertTrue(hasil);
    }

    @Test
    public void testIsValidOperandIsNotANumber() {
        // TC02: Pengujian dengan operand yang bukan merupakan angka
        boolean hasil = Kalkulator.isValid("hai", "{}", "/");
        System.out.println("Method: isValid() TC02, Input: operand1 = 'hai', operand2 = '{}', operator = /, Output: " + hasil);
        assertFalse(hasil);
    }

    @Test
    public void testIsValidOperandOutOfRange() {
        // TC03: Pengujian dengan operand angka yang berada di luar range
        boolean hasil = Kalkulator.isValid("35000", "30", "-");
        System.out.println("Method: isValid() TC03, Input: operand1 = 35000, operand2 = 30, operator = -, Output: " + hasil);
        assertFalse(hasil);
    }

    @Test
    public void testIsValidInvalidOperator() {
        // TC04: Pengujian dengan operator yang tidak valid
        boolean hasil = Kalkulator.isValid("12", "1", "B");
        System.out.println("Method: isValid() TC04, Input: operand1 = 12, operand2 = 1, operator = B, Output: " + hasil);
        assertFalse(hasil);
    }

    @Test
    public void testIsValidDevideByZero() {
        // TC05: Pengujian pembagian dengan pembagi nol
        boolean hasil = Kalkulator.isValid("7", "0", "/");
        System.out.println("Method: isValid() TC05, Input: operand1 = 7, operand2 = 0, operator = /, Output: " + hasil);
        assertFalse(hasil);
    }

}
