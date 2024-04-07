package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProsesKalkulatorTest {

    @Test
    public void testTambah() {
        double a = 2.0;
        double b = 3.0;
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double hasil = prosesKalkulator.tambah(a, b);
        System.out.println("Method: testTambah, Input: a=" + a + ", b=" + b + ", Output: " + hasil);
        assertEquals(5.0, hasil, 0.0001); // Menguji apakah 2 + 3 = 5
    }

    @Test
    public void testKurang() {
        double a = 5.0;
        double b = 3.0;
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
        double hasil = prosesKalkulator.kurang(a, b);
        System.out.println("Method: testKurang, Input: a=" + a + ", b=" + b + ", Output: " + hasil);
        assertEquals(2.0, hasil, 0.0001); // Menguji apakah 5 - 3 = 2
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

    @Test
    public void testBagiDenganNol() {
        double a = 6.0;
        double b = 0.0;
        ProsesKalkulator prosesKalkulator = new ProsesKalkulator();

        assertThrows(ArithmeticException.class, () -> {
            prosesKalkulator.bagi(a, b);
        });
    }
}
