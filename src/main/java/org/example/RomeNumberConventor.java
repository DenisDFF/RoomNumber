package org.example;

public class RomeNumberConventor {
    public int romeNumber (String a) {
        int value = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'I') {
                value += 1;
            } if (a.charAt(i) == 'V') {
                value += 5;
            } if (a.charAt(i) == 'X') {
                value += 10;
            } if (a.charAt(i) == 'L') {
                value += 50;
            } if (a.charAt(i) == 'C') {
                value += 100;
            } if (a.charAt(i) == 'D') {
                value += 500;
            } if (a.charAt(i) == 'M') {
                value += 1000;
            }
        }
        return value;
    }

    String result = "";
    public String intToRoom (int a) {
        for (int i = 0; i <= a; i++) {
            if (a >= 0) {
                if (a >= 1000) {
                    result += "M";
                    a -= 1000;
                } if (a >= 500 && a < 1000) {
                    result += "D";
                    a -= 500;
                } if (a >= 100 && a < 500) {
                    result += "C";
                    a -= 100;
                } if (a >= 50 && a < 100) {
                    result += "L";
                    a -= 50;
                } if (a >= 10 && a < 50) {
                    result += "X";
                    a -= 10;
                } if (a == 5 && a < 10) {
                    result += "V";
                    a -= 5;
                } if (a < 5 && a > 0){
                    result += "I";
                    a -= 1;
                } if (a == 1 && a < 5) {
                    result += "I";
                    a -= 1;
                }
            }
        }
        return result;
    }
}
