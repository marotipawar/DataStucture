package com.maroti.recursion;

public class Recursion {


    public static void main(String[] args) {

        System.out.println(iterativeFactorial(4));
        System.out.println(recursionFactorial(4));
    }

    public static int recursionFactorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num * recursionFactorial(num-1);
    }

    public static int iterativeFactorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
        int factorial=1;
        for(int i=1; i<=num; i++)
        {
            factorial*=i;
        }
        return factorial;
    }
}