package org.example;

import com.sun.jdi.InvalidLineNumberException;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if(Arrays.stream(args).count() > 1)
            throw new InvalidParameterException("Just one argument expected!!!");

        try {
            System.out.println("Hexagonal number for n: " + printHexagonalNumber(Long.parseLong(args[0])));
        } catch (NumberFormatException nfe){
            throw new InvalidParameterException("The parameter is not a number!!!");
        }
    }

    private static Long printHexagonalNumber(Long number){
        if(number < 1)
            throw new InvalidParameterException("Parameter must be positive!!!");
        return number*(2*number-1);
    }


}