package com.company;

import java.util.HashMap;

public class Registration {
    Messages messages = new Messages();

    DeSerialization deSerialization =new DeSerialization();
    ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();
    HashMap<String, String> input = new HashMap<>();
    HashMap<String, String> fromFile = new HashMap<>();
    LoginLogout loginLogout = new LoginLogout();

    public HashMap unHashMap(){
        fromFile = deSerialization.readFromFile();
        input.putAll(fromFile);
        String user;
        String password;
        String inputYorN = null;

            do {
                System.out.println(messages.regUserName);
                user = readFromKeyboard.readString();
                if (input.containsKey(user)) {
                    System.out.println(messages.regWrongUserName);
                    System.out.println(messages.tryAgain);
                    inputYorN = readFromKeyboard.readYesOrNo();
                }
            }
            while (inputYorN.equals("y") || inputYorN.equals("Y"));
                    if(inputYorN.equals("n") || inputYorN.equals("N"));
                    loginLogout.logOut();
        System.out.println(messages.regPassword);
        password = readFromKeyboard.readString();
        input.put(user, password);
        return input;
    }
}
