package com.company;

import java.util.InputMismatchException;

public class Calculator {
    public int sum(int i, int j){
        if(i > 1000 || j > 1000){
            throw new InputMismatchException("You gave me the wrong numbers fool");
        }
       return i+j;
    }
    public boolean isEven(int n ){
        if(n <= 0 || n > 1000){
            throw new IllegalArgumentException("Wrong");
        }
        if (n % 2 == 0) {
        return true;
        }
        return false;
    }
}
