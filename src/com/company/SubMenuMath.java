package com.company;

import java.util.ArrayList;

public class SubMenuMath {
    ReadFromKeyboard readFromKeyboard =new ReadFromKeyboard();
    Messages messages = new Messages();
    LoginLogout loginLogout = new LoginLogout();
    MathematicalOperations mathematicalOperations =new MathematicalOperations();
    Menu menu = new Menu();



    public void subMenuMath() {
        readFromKeyboard.readNumber();
        subMenuMathOptions();
    }

    public void subMenuMathOptions(){
        int option = readFromKeyboard.optionValidation(0, 11);
        String input;
        switch (option){
            case 0:
                loginLogout.exit();
            case 1:
                do{
                    System.out.println(messages.additionTitle);
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.additionResult + mathematicalOperations.addition(arrayForOperations));
                    System.out.print(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y"));
                if (input.equals("n")){
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 2:
                do {
                    System.out.println(messages.subtractionTitle);
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.subtractionResult + mathematicalOperations.subtraction(arrayForOperations));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 3:
                do {
                    System.out.println(messages.multiplicationTitle);
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.multiplicationResult + mathematicalOperations.multiplication(arrayForOperations));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 4:
                do {
                    System.out.println(messages.divisionTitle);
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.divisionResult + mathematicalOperations.division(arrayForOperations));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 5:
                do {
                    System.out.println(messages.powerRiseTitle);
                    System.out.print(messages.powerRiseBase);
                    double base = readFromKeyboard.readDoubleNumber();
                    System.out.print(messages.powerRiseExponent);
                    double exponent = readFromKeyboard.readDoubleNumber();
                    System.out.println(messages.powerRiseResult + mathematicalOperations.power(base,exponent));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 6:
                do {
                    System.out.print(messages.radicalTitle);
                    System.out.println(messages.radicalUnder);
                    double under = readFromKeyboard.readDoubleNumber();
                    System.out.print(messages.radicalOrdin);
                    double order = readFromKeyboard.readDoubleNumber();
                    System.out.println(messages.radicalResult + mathematicalOperations.radical(under, order));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 7:
                do {
                    System.out.println(messages.quadraticEquationTitle);
                    System.out.println(messages.formQuadraticEquation);
                    mathematicalOperations.quadraticEquation();
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 8:
                do {
                    System.out.println(messages.geometricAverageTitle);
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.geometricAverageResult + mathematicalOperations.geometricAverage(arrayForOperations));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 9:
                do {
                    System.out.println(messages.arithmeticAverageTitle);
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.arithmeticAverageResult + mathematicalOperations.arithmeticAverage(arrayForOperations));
                    System.out.println(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y") || input.equals("Y"));
                if (input.equals("n") || input.equals("N")) {
                    System.out.println(messages.mathMenuOption);
                    subMenuMath();
                }
                break;
            case 10:
                menu.menu();
                break;
            case 11:
                loginLogout.logOut();
                break;
        }
    }
}
