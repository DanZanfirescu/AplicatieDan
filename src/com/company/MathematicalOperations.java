package com.company;

import java.util.ArrayList;

public class MathematicalOperations {
    public double addition(ArrayList<Double> arrayForOperations) {
        double sum = 0;
        int i;
            for (i = 0; i < arrayForOperations.size(); i++) {
                sum = sum + arrayForOperations.get(i);
            }
        return sum;
    }

    public double subtraction(ArrayList<Double> arrayForOperations ){
        double subt = arrayForOperations.get(0);
        int i;
            for (i = 1; i < arrayForOperations.size(); i++) {
                subt = subt- arrayForOperations.get(i);
            }
        return subt;
    }

    public double multiplication(ArrayList<Double> arrayForOperations){
        double mult = 1;
        int i;
            for (i = 0; i < arrayForOperations.size(); i++) {
                mult = mult* arrayForOperations.get(i);
            }
        return mult;
    }

    public double division(ArrayList<Double> arrayForOperations){
        double div = arrayForOperations.get(0);
        int i;
            for (i = 1; i < arrayForOperations.size(); i++) {
                div = div/ arrayForOperations.get(i);
            }
        return div;
    }

    public double power (double base, double exponent){
        return StrictMath.pow(base, exponent);
    }

    public double radical(double under, double order) {
        return StrictMath.pow(under, 1 / order);
    }

    public void quadraticEquation(){
        ReadFromKeyboard readFromKeyboard = new ReadFromKeyboard();
        Messages messages = new Messages();

        System.out.print(messages.valueOfParameterA);
        double parameterA = readFromKeyboard.readDoubleNumber();
        System.out.print(messages.valueOfParameterB);
        double parameterB = readFromKeyboard.readDoubleNumber();
        System.out.print(messages.valueOfParameterC);
        double parameterC = readFromKeyboard.readDoubleNumber();
        double delta = (parameterB*parameterB) - 4*parameterA*parameterC;
        double radicalFromDelta = Math.sqrt(delta);
            if(parameterA != 0 && parameterB != 0 && parameterC != 0){
                if(delta<0){
                    System.out.println(messages.noSolutions);
                }
                else if (delta == 0){
                    double x = -parameterB/2*parameterA;
                    System.out.println(messages.sameSolution + x);
                }
                else{
                    double x1 = (-parameterB + radicalFromDelta) / 2 * parameterA;
                    double x2 = (-parameterB - radicalFromDelta) / 2 * parameterA;
                    System.out.println(messages.firstSolution + x1);
                    System.out.println(messages.secondSolution + x2);
                }
            }
            else if (parameterA != 0 && parameterB != 0 && parameterC == 0){
                double x1 = 0;
                double x2 = -parameterB/parameterA;
                System.out.println(messages.firstSolution + x1);
                System.out.println(messages.secondSolution + x2);
            }
            else if (parameterA != 0 && parameterB == 0 && parameterC != 0){
                if(-parameterC/parameterA < 0){
                    System.out.println(messages.noSolutions);
                }
                if(-parameterC/parameterA == 0){
                    double x = 0;
                    System.out.println(messages.secondSolution + x);
                }
                if (-parameterC/parameterA > 0){
                    double x1 = -Math.sqrt(-parameterC/parameterA);
                    double x2 = Math.sqrt(-parameterC/parameterA);
                    System.out.println(messages.firstSolution + x1);
                    System.out.println(messages.secondSolution + x2);
                }
            }
            else if(parameterA == 0 && parameterB != 0 && parameterC != 0){
                double x = -parameterC/parameterB;
                System.out.println(messages.sameSolution + x);
            }
            else if (parameterA != 0 && parameterB == 0 && parameterC == 0){
                double x = 0;
                System.out.println(messages.sameSolution + x);
            }
            else if (parameterA == 0 && parameterB != 0 && parameterC == 0){
                double x = 0;
                System.out.println(messages.sameSolution + x);
            }
            else if (parameterA == 0 && parameterB == 0 && parameterC != 0){
                System.out.println(messages.noSolutions);
            }
            else if (parameterA ==0 && parameterB ==0 && parameterC == 0){
                System.out.println(messages.noSolutions);
            }

    }

    public double geometricAverage (ArrayList<Double> arrayForOperations){
        double numbers = arrayForOperations.size();
        double multiplication = multiplication(arrayForOperations);
        return power(multiplication, 1/numbers);
    }

    public double arithmeticAverage (ArrayList<Double> arrayForOperations){
        double numbers = arrayForOperations.size();
        double sum = addition(arrayForOperations);
        return sum/numbers;
    }
}