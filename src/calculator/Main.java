package calculator;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Calculator calculatorDevice = new Calculator();
        Console cons = System.console();
        float num1,num2;

        while(true){
            String line = cons.readLine("> ").toLowerCase();
            String[] input = line.split(" ");
            String first = input[0];
            String last = input[input.length - 1];

            if(line.contains("+")){
                if (first.equals("$last")){
                    num1 = calculatorDevice.getLatestValue();
                }else{
                    num1 = Float.parseFloat(first);
                }

                if (last.equals("$last")){
                    num2 = calculatorDevice.getLatestValue();
                }else{
                    num2 = Float.parseFloat(last);
                }
                calculatorDevice.add(num1, num2);

            }else if(line.contains("exit")){
                calculatorDevice.exit();
            }
            else if(line.contains("-")){
                if (first.equals("$last")){
                    num1 = calculatorDevice.getLatestValue();
                }else{
                    num1 = Float.parseFloat(first);
                }

                if (last.equals("$last")){
                    num2 = calculatorDevice.getLatestValue();
                }else{
                    num2 = Float.parseFloat(last);
                }
                calculatorDevice.sub(num1, num2);
            }
            else if(line.contains("*")){
                if (first.equals("$last")){
                    num1 = calculatorDevice.getLatestValue();
                }else{
                    num1 = Float.parseFloat(first);
                }

                if (last.equals("$last")){
                    num2 = calculatorDevice.getLatestValue();
                }else{
                    num2 = Float.parseFloat(last);
                }
                calculatorDevice.mul(num1, num2);


            }
            else if(line.contains("/")){
                if (first.equals("$last")){
                    num1 = calculatorDevice.getLatestValue();
                }else{
                    num1 = Float.parseFloat(first);
                }

                if (last.equals("$last")){
                    num2 = calculatorDevice.getLatestValue();
                }else{
                    num2 = Float.parseFloat(last);
                }
                calculatorDevice.divide(num1, num2);
            }
        }
    }
    
}