package com.calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    String getOutput() {
        return outputStreamCaptor.toString().trim();
    }

    @Test
    void testMain_ValidOperandsValidOperator() {
        provideInput("4\n10\n+\n");
        Main.main(new String[] {});
        assertTrue(getOutput().contains("Hasil: 14.0"));
    }

    @Test
    void testMain_ValidOperandsInvalidOperator() {
        provideInput("4\n10\n^\n");
        Main.main(new String[] {});
        assertTrue(getOutput().contains("Operator yang diinputkan tidak valid!"));
    }

    @Test
    void testMain_InvalidOperandsValidOperator() {
        provideInput("x\n10\n+\n");
        Main.main(new String[] {});
        assertTrue(getOutput().contains("Nilai yang dihitung harus angka!"));
    }

    @Test
    void testMain_InvalidOperandsInvalidOperator() {
        provideInput("x\n10\n^\n");
        Main.main(new String[] {});
        assertTrue(getOutput().contains("Nilai yang dihitung harus angka!"));
    }
}
