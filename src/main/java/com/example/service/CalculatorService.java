package com.example.service;

public class CalculatorService {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        if(b==0)
        {
            throw  new ArithmeticException("2nd number can't be zero");
        }
        return a/b;
    }
    public boolean checkPositive(int a)
    {
        if(a>0){
            return true;
        }
        return false;
    }
}
