package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LogicalOperations {


    public ArrayList<Double> ascendingOrder(ArrayList<Double> arrayForOperations) {
        int i = 0;
        int j = 0;
        for(i = 0; i < arrayForOperations.size(); i++){
            for (j = i+1; j < arrayForOperations.size(); j++){
                if(arrayForOperations.get(i) > arrayForOperations.get(j)){
                    double temporary = arrayForOperations.get(i);
                    arrayForOperations.set(i, arrayForOperations.get(j));
                    arrayForOperations.set(j, temporary);
                }
            }
        }
        return arrayForOperations;
    }

    public double smallestNumber(ArrayList<Double> ascendingOrder) {
        ascendingOrder(ascendingOrder);
        double smallestValue = 0;
        for (int i = 0; i < ascendingOrder.size(); i++) {
            smallestValue = ascendingOrder.get(0);
        }
        return smallestValue;
    }

    public double biggestNumber(ArrayList<Double> descendingOrder) {
        descendingOrder(descendingOrder);
        double biggestValue = 0;
        for (int i = 0; i <descendingOrder.size(); i++) {
            biggestValue = descendingOrder.get(0);
        }
        return biggestValue;
    }

    public ArrayList<Double> descendingOrder (ArrayList<Double> arrayForOperations){
        int i;
        int j;
        for (i = 0; i < arrayForOperations.size(); i++){
            for (j = i+1; j < arrayForOperations.size(); j++){
                if (arrayForOperations.get(i) < arrayForOperations.get(j)){
                    double temporary = arrayForOperations.get(i);
                    arrayForOperations.set(i, arrayForOperations.get(j));
                    arrayForOperations.set(j, temporary);
                }
            }
        }
        return arrayForOperations;
    }

    public ArrayList<Integer> fibonacciNumbers(int lenght) {
        int f0 = 0;
        int f1 = 1;
        ArrayList<Integer> fibonacciArray = new ArrayList<>();
        fibonacciArray.add(f0);
        fibonacciArray.add(f1);
        int f2;
            for (int i = 2; i < lenght; i++) {
                f2 = f1 + f0;
                f0 = f1;
                f1 = f2;
                fibonacciArray.add(f2);
            }
        return fibonacciArray;
    }

    public boolean palindrome(String inputWord){
        boolean palindrome = true;
        Messages messages = new Messages();
        String output = "";
        for(int i = inputWord.length()-1; i>=0; i--){
            output = output + inputWord.charAt(i);
        }
            if(output.equals(inputWord)){
                palindrome = true;
            }
            else {
                palindrome = false;
        }
        return palindrome;
    }
}