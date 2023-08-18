package org.example;

public class MatematicFunktion {
    public int addition (int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtraktion (int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply (int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide (int a, int b) {
        int result = a / b;
        return result;
    }



    public int arabishCalculator (int chosseFunction, int valueArabishA, int valueArabishB) {
        int valueArabishResult = 0;

        if (chosseFunction == 1) {
            valueArabishResult = addition(valueArabishA, valueArabishB);
        } if (chosseFunction == 2) {
            valueArabishResult = subtraktion(valueArabishA, valueArabishB);
        } if (chosseFunction == 3) {
            valueArabishResult = multiply(valueArabishA, valueArabishB);
        } if (chosseFunction == 4) {
            valueArabishResult = divide(valueArabishA, valueArabishB);
        }
        return valueArabishResult;
    }
}