package com.calculator;

public class Kalkulator {
    public double kalkulasi(String operand1, String operand2, String operator) {
        double hasil = 0;
        if (isValid(operand1, operand2, operator)) {
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
            }
        }else{
            hasil = Double.NaN;
        }
        return hasil;
    }

    public static boolean isValid(String operand1, String operand2, String operator) {

        String regex = "^-?[0-9]+$";
        boolean isValid = true;

        boolean isNumber1 = operand1.matches(regex);
        boolean isNumber2 = operand2.matches(regex);

        // Validasi apakah operand adalah angka
        if (!isNumber1 || !isNumber2) {
            System.out.println("Nilai yang dihitung harus angka!");
            isValid = false;
        } else {
            double num1 = Double.parseDouble(operand1);
            double num2 = Double.parseDouble(operand2);

            // Validasi range angka
            if (num1 < -32768 || num2 > 32767 || num2 < -32768 || num2 > 32767) {
                System.out.println("Nilai operand harus berada pada range -32,768 hingga 32,767!");
                isValid = false;
            }
            // Validasi operator
            else if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                System.out.println("Operator yang diinputkan tidak valid!");
                isValid = false;
            }
            // Validasi pembagi tidak boleh nol
            else if (operator.equals("/") && num2 == 0.0) {
                System.out.println("Pembagi tidak boleh nol!");
                isValid = false;
            }
        }
        return isValid;
    }
}
