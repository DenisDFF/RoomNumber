package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomeNumberConventor romeNumberConventor = new RomeNumberConventor();
        MatematicFunktion matematicFunktion = new MatematicFunktion();
        testArabishToRoomConvert();
        testArabishMathEmpty();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Room a:");
        String ascannLineA = scanner.next().toUpperCase();
        System.out.println("Number Room b:");
        String scannLineB = scanner.next().toUpperCase();
        System.out.println("Chose function: 1. Addition 2. Subtraction 3. Multiple 4. Divide");
        int chosseFunction = scanner.nextInt();

        int valueArabishA = romeNumberConventor.romeNumber(ascannLineA);
        int valueArabishB = romeNumberConventor.romeNumber(scannLineB);

        int valueArabishResult = matematicFunktion.arabishCalculator(chosseFunction, valueArabishA, valueArabishB);

        String roomResultNotRevers = romeNumberConventor.intToRoom(valueArabishResult);
        StringBuilder roomResult = new StringBuilder(roomResultNotRevers).reverse();
        System.out.println(roomResult);
    }

    @Test
    public static void testArabishToRoomConvert() {
        RomeNumberConventor romeNumberConventor = new RomeNumberConventor();
        MatematicFunktion matematicFunktion = new MatematicFunktion();
        String roomNumberA = "V";
        String roomNumberB = "XV";
        int aravishNumberA = romeNumberConventor.romeNumber(roomNumberA);
        int aravishNumberB = romeNumberConventor.romeNumber(roomNumberB);
        int arabishMathResult = matematicFunktion.addition(aravishNumberA, aravishNumberB);
        String romeMathResult = romeNumberConventor.intToRoom(arabishMathResult);
        assertEquals("XX", romeMathResult);
    }

    @Test
    public static void testArabishMathEmpty() {
        MatematicFunktion matematicFunktion = new MatematicFunktion();
        int testA = 12;
        int testB = 11;
        int testResult = matematicFunktion.multiply(testA, testB);
        assertEquals(132, testResult);
    }
}