package com.percy.calcengine;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        double val1=100.0d;
        double val2=50.0d;
        double result;
        char opCode='d';

        if (opCode=='a')
            result = val1+val2;
        else if(opCode == 's')
            result = val1-val2;
        else if(opCode=='d')
            //conditional assingment
            result = val2 != 0.0d?val1/val2:0.0d;
//            if (val2 !=0.0d)
//                result=val1/val2;
//            else
//                result = 0.0d;
        else if(opCode=='m')
            result=val1*val2;
        else {
            System.out.println("Error -invalid appcode");
            result = 0.0d;
        }

        System.out.println(result);
    }
}
