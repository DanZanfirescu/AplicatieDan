package com.company;

import java.util.ArrayList;

public class SubMenuLogic {

    ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();
    Messages messages = new Messages();
    LoginLogout loginLogout = new LoginLogout();
    LogicalOperations logicalOperations = new LogicalOperations();
    Menu menu = new Menu();

    public void subMenuLogic(){
        readFromKeyboard.readNumber();
        subMenuLogicOption();
    }

    public void subMenuLogicOption(){

        int option = readFromKeyboard.optionValidation(0,5);
        String input;
        switch (option){
            case 0:
                loginLogout.exit();
            case 1:
                do{
                    System.out.println(messages.operationsInstruction);
                    ArrayList<Double> arrayForOperations = readFromKeyboard.stringToArrayOfDoubles();
                    System.out.println(messages.smallestResult + logicalOperations.smallestNumber(arrayForOperations));
                    System.out.println(messages.biggestResult + logicalOperations.biggestNumber(arrayForOperations));
                    System.out.println(messages.ascendingOrder + logicalOperations.ascendingOrder(arrayForOperations));
                    System.out.println(messages.descendingOrder + logicalOperations.descendingOrder(arrayForOperations));
                    System.out.print(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y"));
                if (input.equals("n")){
                    System.out.println(messages.logicMenuOption);
                    subMenuLogic();
                }
                break;
            case 2:
                do{
                    System.out.println(messages.lenghtOfFibonacci);
                    int lenght = readFromKeyboard.readNumber();
                    System.out.println(messages.firstFibonacciNumbers + lenght + messages.firstFibonacciNumers2 + logicalOperations.fibonacciNumbers(lenght));
                    System.out.print(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y"));
                if (input.equals("n")){
                    System.out.println(messages.logicMenuOption);
                    subMenuLogic();
                }
                break;
            case 3:
                do{
                    System.out.println(messages.stringInput);
                    String inputWord = readFromKeyboard.readString();
                    boolean palindrome = logicalOperations.palindrome(inputWord);
                        if (palindrome){
                            System.out.println(inputWord + messages.palidorme);
                        }
                        else {
                            System.out.println(inputWord + messages.notPalidorme);
                        }
                    System.out.print(messages.repeatOperation);
                    input = readFromKeyboard.readYesOrNo();
                }
                while (input.equals("y"));
                if (input.equals("n")){
                    System.out.println(messages.logicMenuOption);
                    subMenuLogic();
                }
                break;
            case 4:
                menu.menu();
                break;
            case 5:
                loginLogout.logOut();
                break;
        }
    }
}
