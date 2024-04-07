package com.calculator;
public class Kalkulator {
    public double kalkulasi(String operand1, String operand2, String operator) {

        if(isValid(operand1, operand2, operator)) {
            double hasil = 0;
            ProsesKalkulator prosesKalkulator = new ProsesKalkulator();
            double angka1 = Double.parseDouble(operand1);
            double angka2 = Double.parseDouble(operand2);

            switch (operator) {
                case "+":
                    hasil = prosesKalkulator.tambah(angka1, angka2);
                    break;
                case "-":
                    hasil = prosesKalkulator.kurang(angka1, angka2);
                    break;
                case "*":
                    hasil = prosesKalkulator.kali(angka1, angka2);
                    break;
                case "/":
                    hasil = prosesKalkulator.bagi(angka1, angka2);
                    break;
                default:
                    System.out.println("Operator tidak valid!");
            }
            return hasil;
        }
        return Double.NaN;
    }

    public static boolean isValid(String operand1, String operand2, String operator) {

        // Validasi apakah operand adalah angka
        try {
            Double.parseDouble(operand1);
            Double.parseDouble(operand2);
        } catch (NumberFormatException e) {
            System.out.println("Nilai yang dihitung harus angka!");
            return false;
        }

        // Validasi range angka
        double num1 = Double.parseDouble(operand1);
        double num2 = Double.parseDouble(operand2);
        if (num1 < -32768 || num1 > 32767 || num2 < -32768 || num2 > 32767) {
            System.out.println("Nilai operand harus berada pada range -32,768 hingga 32,767!");
            return false;
        }

        // Validasi operator
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("Operator yang diinputkan tidak valid!");
            return false;
        }

        // Validasi pembagi tidak boleh nol
        if (operator.equals("/") && num2 == 0.0) {
            System.out.println("Pembagi tidak boleh nol!");
            return false;
        }

        return true;
    }
}
