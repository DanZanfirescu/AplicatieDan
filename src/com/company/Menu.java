package com.company;

public class Menu {
    public void menu(){
        LoginLogout loginLogout = new LoginLogout();
        MathematicalOperations mathematicalOperations = new MathematicalOperations();
        LogicalOperations logicalOperations = new LogicalOperations();
        ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();
        Messages messages = new Messages();
        SubMenuMath subMenuMath = new SubMenuMath();
        SubMenuLogic subMenuLogic = new SubMenuLogic();


        System.out.print(messages.chooseOptionMenu);
        System.out.println(messages.menuOption);
        readFromKeyboard.readNumber();
        int option = readFromKeyboard.optionValidation(0, 2);

        switch (option){
            case 0:
                loginLogout.logOut();
            case 1:
                System.out.println(messages.mathMenuTitle);
                System.out.print(messages.chooseOptionMenu);
                System.out.println(messages.mathMenuOption);
                subMenuMath.subMenuMath();
                break;
            case 2:
                System.out.println(messages.logicMenuTitle);
                System.out.println(messages.chooseOptionMenu);
                System.out.println(messages.logicMenuOption);
                subMenuLogic.subMenuLogic();
                break;
        }
    }
}
