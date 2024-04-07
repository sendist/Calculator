package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KalkulatorTest {

    @Test
    public void testTambah() {
        System.out.println("Running testTambah...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("2", "3", "+");
        System.out.println("Expected result: 5.0, Actual result: " + hasil);
        assertEquals(5.0, hasil, 0.0001); // Menguji apakah 2 + 3 = 5
    }

    @Test
    public void testKurang() {
        System.out.println("Running testKurang...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("5", "3", "-");
        System.out.println("Expected result: 2.0, Actual result: " + hasil);
        assertEquals(2.0, hasil, 0.0001); // Menguji apakah 5 - 3 = 2
    }

    @Test
    public void testKali() {
        System.out.println("Running testKali...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("2", "3", "*");
        System.out.println("Expected result: 6.0, Actual result: " + hasil);
        assertEquals(6.0, hasil, 0.0001); // Menguji apakah 2 * 3 = 6
    }

    @Test
    public void testBagi() {
        System.out.println("Running testBagi...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("6", "3", "/");
        System.out.println("Expected result: 2.0, Actual result: " + hasil);
        assertEquals(2.0, hasil, 0.0001); // Menguji apakah 6 / 3 = 2
    }

    @Test
    public void testValidasiOperandBukanAngka() {
        System.out.println("Running testValidasiOperandBukanAngka...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("2a", "3", "+");
        System.out.println("Expected result: NaN, Actual result: " + hasil);
        assertEquals(Double.NaN, hasil, 0.0001); // Menguji apakah hasil adalah NaN jika operand bukan angka
    }

    @Test
    public void testValidasiRangeAngka() {
        System.out.println("Running testValidasiRangeAngka...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("40000", "3", "+");
        System.out.println("Expected result: NaN, Actual result: " + hasil);
        assertEquals(Double.NaN, hasil, 0.0001); // Menguji apakah hasil adalah NaN jika operand di luar range
    }

    @Test
    public void testValidasiOperatorTidakValid() {
        System.out.println("Running testValidasiOperatorTidakValid...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("2", "3", "%");
        System.out.println("Expected result: NaN, Actual result: " + hasil);
        assertEquals(Double.NaN, hasil, 0.0001); // Menguji apakah hasil adalah NaN jika operator tidak valid
    }

    @Test
    public void testValidasiPembagiNol() {
        System.out.println("Running testValidasiPembagiNol...");
        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi("6", "0", "/");
        System.out.println("Expected result: NaN, Actual result: " + hasil);
        assertEquals(Double.NaN, hasil, 0.0001); // Menguji apakah hasil adalah NaN jika pembagi nol
    }
}
