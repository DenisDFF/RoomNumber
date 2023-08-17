package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomeNumber romeNumber = new RomeNumber();
        MatematicFunktion matematicFunktion = new MatematicFunktion();
        IntToRoomNumber intToRoomNumber = new IntToRoomNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Room a:");
        System.out.println("Number Room b:");

        String a = scanner.next();
        String b = scanner.next();
        int value1 = romeNumber.romeNumber(a);
        int value2 = romeNumber.romeNumber(b);

        int valueArabishResult = matematicFunktion.addition(value1, value2);
        String roomResult = intToRoomNumber.intToRoom(valueArabishResult);
        System.out.println(roomResult);

    }
}