package org.example;

public class RomeNumber {
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
}
