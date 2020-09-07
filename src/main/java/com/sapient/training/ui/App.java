package com.sapient.training.ui;

import com.sapient.training.service.Calculator;

public class App 
{
    public static void main( String[] args )
    {
    	Calculator mycal = new Calculator();
        System.out.println(mycal.addition(2.0, 3.0) );
        System.out.println(mycal.subtraction(2, 1));
    }
}
