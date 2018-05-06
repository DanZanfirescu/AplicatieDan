package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ReadFromKeyboard {

    private Messages messages = new Messages();

    int input = 0;
    public int readNumber() {
        boolean repeat = true;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                input = keyboard.nextInt();
                repeat = false;
            } catch (InputMismatchException notNumber) {
                System.out.println(messages.notNumber);
            }
        }
        while (repeat);
        return input;
    }

    public int optionValidation(int a, int b) {
        while (input < a || input > b) {
            System.out.println( messages.notValidOption);
            readNumber();
        }
        return input;
    }

    public ArrayList<Double> stringToArrayOfDoubles() {
        String inputString = null;
        boolean repeat = true;
        ArrayList<Double> inputNumbers;
        inputNumbers = null;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                inputString = keyboard.nextLine();
                inputNumbers = new ArrayList<>();
                String[] split = inputString.split("\\s+");
                for (String aSplit : split) {
                    if (!aSplit.isEmpty()) {
                        inputNumbers.add(Double.valueOf(aSplit));
                    }
                }
                repeat = false;
            } catch (NumberFormatException notCorrectInput) {
                System.out.println(messages.wrongInput);
            }
        }
        while (repeat);
        return inputNumbers;
    }

    String inputStringYesOrNo;
    public String readYesOrNo() {
        String inputStringYesOrNo = null;
        boolean repeat = true;
        do {
            try {
                Scanner tastatura = new Scanner(System.in);
                inputStringYesOrNo = tastatura.next("^[ynYN]+$");
                repeat = false;
            } catch (InputMismatchException notCorrectInput) {
                System.out.println(messages.notYOrN);
            }
        }
        while (repeat);
        return inputStringYesOrNo;
    }

    public double readDoubleNumber() {
        double inputDouble = 0;
        boolean repeat = true;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                inputDouble = keyboard.nextDouble();
                repeat = false;
            } catch (InputMismatchException notNumber) {
                System.out.println(inputDouble + messages.notNumber);
            }
        }
        while (repeat);
        return inputDouble;
    }

    public String readString(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next();
    }






 /*   public ArrayList<String> readString(){
        String inputString = null;
        boolean repeat = true;
        ArrayList<String> input;
        input = null;

        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                inputString = keyboard.nextLine();
                input = new ArrayList<String>();
                String[] split = inputString.split("\\s+");
                for (String aSplit : split) {
                    if (!aSplit.isEmpty()) {
                        input.add(aSplit);
                    }
                }
                repeat = false;
            } catch (NumberFormatException notCorrectInput) {
                System.out.println(messages.wrongInput);
            }
        }
        while (repeat);
        return input;


*/
    }














