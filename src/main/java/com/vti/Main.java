package com.vti;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        try {
            Scanner input = new Scanner(System.in);
            Integer intNumber = null;

            System.out.println("Hãy nhập vào một số nguyên: ");
            String strNumber = input.nextLine();
            intNumber = new Integer(strNumber);

            System.out.println("Chuyển thành Hexa: " + Integer.toHexString(intNumber));
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập vào một số nguyên");
        }




    }
}