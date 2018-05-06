package com.company;

public class RegLoginMenu {
    Messages messages = new Messages();
    ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();
    LoginLogout loginLogout = new LoginLogout();
    Serialization serialization = new Serialization();
    Menu menu = new Menu();

    public void regLogMenu(){

        System.out.print(messages.chooseOptionMenu);
        System.out.print(messages.regLogMenu);
        readFromKeyboard.readNumber();
        int option = readFromKeyboard.optionValidation(0, 2);
        switch (option){
            case 0:
                loginLogout.exit();
            case 1:
                System.out.println(messages.hello);
                serialization.writeToFile();
                System.out.println(messages.succesReg);
                System.out.println(messages.chooseOptionMenu);
                System.out.println(messages.afterRegMenu);
                readFromKeyboard.readNumber();
                int option1 = readFromKeyboard.optionValidation(0, 1);
                switch (option1){
                    case 0:
                        loginLogout.logOut();
                    case 1:
                        menu.menu();
                        break;
                }
                break;
            case 2:
                loginLogout.login();
                break;

        }

    }





}
