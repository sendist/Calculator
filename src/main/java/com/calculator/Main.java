package com.calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan operand pertama: ");
        String operand1 = scanner.next();

        System.out.print("Masukkan operand kedua: ");
        String operand2 = scanner.next();

        System.out.println("Pilih operator (+, -, *, /): ");
        String operator = scanner.next();

        Kalkulator kalkulator = new Kalkulator();
        double hasil = kalkulator.kalkulasi(operand1, operand2, operator);
        if (!Double.isNaN(hasil)) {
            System.out.println("Hasil: " + hasil);
        }

    }
}
