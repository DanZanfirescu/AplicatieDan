package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class DeSerialization {

    public HashMap readFromFile() {
        HashMap fromFile = null;
        try {
            fromFile = new HashMap();
            FileInputStream fileInputStream = new FileInputStream("regFile.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            fromFile = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException err){
            err.printStackTrace();
        }catch (ClassNotFoundException er){
            er.printStackTrace();
        }
        return fromFile;
    }
}
