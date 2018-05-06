package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Serialization {

    Registration registration = new Registration();

    public void writeToFile()  {
        try {
            HashMap<String, String> input = new HashMap<>();
            input = registration.unHashMap();
            FileOutputStream fileOutputStream = new FileOutputStream("regFile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(input);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
