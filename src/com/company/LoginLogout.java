package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class LoginLogout {

    Messages messages = new Messages();

    HashMap<String, String> fromFile = new HashMap<>();



    public void login (){
        DeSerialization deSerialization = new DeSerialization();
        Menu menu = new Menu();
        ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();


        fromFile = deSerialization.readFromFile();
        String user = null;
        String password = null;
        boolean repeat = true;
        Scanner  keyboard = new Scanner(System.in);
            do{
                try{
                System.out.print(messages.userName);
                user = keyboard.next();
                System.out.print(messages.password);
                password = keyboard.next();
                    if (fromFile.get(user).equals(password)) {
                       repeat = false;
                    }
                    }catch (NullPointerException error){
                    System.out.println(messages.wrongUserOrPassword);
                }
            }
            while (repeat);
            System.out.println(messages.wellcome);
        menu.menu();
    }


    public void logOut(){
        RegLoginMenu regLoginMenu = new RegLoginMenu();
        regLoginMenu.regLogMenu();

    }

    public void exit(){
        System.out.println(messages.exit);
        System.exit(0);


    }
}




